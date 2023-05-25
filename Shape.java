package class23Project;

public interface Shape {

    //Interface declaration: by first user
        void draw();

    //Implementation: by second user
    class Rectangle implements Shape{
        public void draw(){
            System.out.println("drawing rectangle");}
    }
    class Circle implements Shape{
        public void draw(){
            System.out.println("drawing circle");}
    }
    //Using interface: by third user
    class TestInterface1{
        public static void main(String args[]){
            Shape d=new Circle();
            d.draw();
        }}
}
