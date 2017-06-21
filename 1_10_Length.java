//辺の長さを表すクラス
class Length {
    protected int height; //高さ
    protected int width;  //幅
    //コンストラクタ
    public Length(int h, int w) {
        height = h;
        width = w;
    }
    //フィールドの出力
    public void show() {
        System.out.printf("height: %d, width: %d\n", height, width);
    }
    //面積を出力する
    public void area() {
        System.out.println("スーパークラスは面積を求めない");
    }
}

//四角形を表すクラス
class Rectangle extends Length {
    public Rectangle(int h, int w) {
        super(h, w);
    }
    //四角形の面積を求める
    public void area() {
        System.out.printf("四角形の面積: %d\n", 
                height*width);
    }
}

//三角形を表すクラス
class Triangle extends Length {
    public Triangle(int h, int w) {
        super(h, w);
    }
    //三角形の面積を求める
    public void area() {
        System.out.printf("三角形の面積: %d\n", 
                height*width/2);
    }
}
