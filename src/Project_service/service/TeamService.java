package Project_service.service;

import Project_service.domain.Architect;
import Project_service.domain.Designer;
import Project_service.domain.Employee;
import Project_service.domain.Programmer;

public class TeamService {
    private static int counter = 1;//给memberId自动赋值
    private final  int Max_MEMBER = 5;
    private Programmer[] team = new Programmer[Max_MEMBER];
    private int total;//记录开发团队的人数


    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }
    public void addMember(Employee e) throws TeamException{
        if (total>=Max_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch(status){
            case BUSY:
                throw new TeamException("该员工已是某团队成员，无法添加");
            case VOCATION:
                throw new TeamException("休假中");
        }
        
        boolean isExist = isExist(p);
        if (isExist){
            throw new TeamException("已在团队中");
        }

        //记录程序员，架构师，设计师的个数
        int ProNum = 0,DesNum = 0,ArcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                ArcNum++;
            } else if (team[i] instanceof Designer) {
                DesNum++;
            }else {
                ProNum++;
            }
        }
        if (p instanceof Architect){
            if (ArcNum>=1){
                throw new TeamException("至多一名架构师");
            }
        } else if (p instanceof Designer){
            if (DesNum>=2){
                throw new TeamException("至多两名设计师");
            }
        } else {
            if (ProNum>=3){
                throw new TeamException("至多三名程序员");
            }
        }

        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
        team[total++] = p;
    }

    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId()==p.getId()){
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException{
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId()==memberId){
                //找到了
                team[i].setStatus(Status.FREE);
                //员工的memberID可以不用改

                break;
            }
        }
         //没找到
        if (i==total){
            throw new TeamException("删除失败");
        }
        //调整数组
        for (int j = i; j < total-1; j++) {
            team[j] = team[j+1];
        }
        team[total-1] = null;
        total--;
    }
}
