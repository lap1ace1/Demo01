package Project02;
//编写equalsArea方法测试两个对象的面积是否相等，
//编写displayGeometricObject方法显示对象的面积
public class GemotricTest {
    public static void main(String[] args) {
        GemotricTest test = new GemotricTest();
        Circle c = new Circle("red",1.0,2);
        Circle c2 = new Circle("bule",1.2,2.3);
        MyRectangle m = new MyRectangle("red",1,1,1);
        test.displayGeometricObject(m);
        test.displayGeometricObject(c);
        test.displayGeometricObject(c2);
        System.out.println(test.equalsArea(c,c2));
    }
    public boolean equalsArea(GeometricObject a1,GeometricObject a2){
        return a1.findArea()==a2.findArea();
    }
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形的面积为"+g.findArea());
    }
}
