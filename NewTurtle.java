public class NewTurtle extends BaseTurtle {
    public void draw(){
        pen.up();
        pen.setStrokeWidth(20);
        pen.setColor(1,1,0);
        this.moveBy(0,-3);
        this.back(5);
        this.triangle(10);
        pen.setColor(0,0,0);
        pen.setStrokeWidth(5);
        this.triangle(10);
        this.moveBy(4.5,3);
        this.rectangle(1,4);
        this.moveBy(0,-2);
        this.square(1);
    }

    private void triangle(double x){
        pen.down();
        for(int i=0; i < 3; i++) {
            this.forward(x);
            this.turn(120);
        }
        pen.up();
    }

    private void rectangle(double largura, double altura){
        pen.down();
        for(int i=0; i < 2; i++){
            this.forward(largura);
            this.turn(90);
            this.forward(altura);
            this.turn(90);
        }
        pen.up();
    }

    private void square(double size) {
        pen.down();
        for (int i = 0; i < 4; i++) {
            this.forward(size);
            this.turn(90);
        }
        pen.up();
    }
}
