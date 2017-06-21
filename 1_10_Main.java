class Pd10Base1 {
    public static void main(String[] args) {
        //インスタンスを作成する
        Base b1 = new Base();
        Base b2 = new Even(10);
        //showNumの動作確認
        System.out.println("--- b1.show() ---");
        b1.showNum();
        System.out.println("--- b2.show() ---");
        b2.showNum();
        //setNumの動作確認
        b1.setNum(15);  //b1はどんな値でもsetできる
        b2.setNum(15);  //b2は奇数はsetできない
        b2.setNum(8);   //偶数はsetできる
        b2.setNum(3);   //setできない
        //setNumの結果を出力する
        System.out.println("--- b1.show() ---");
        b1.showNum();
        System.out.println("--- b2.show() ---");
        b2.showNum();   //b2はacceptとrejectも出力する
    }
}

class Pd10Base2 {
    public static void main(String[] args) {        
        Base[] bases = new Base[2];
        bases[0] = new Base(100);
        bases[1] = new Even(200);
        //ここに追加する
    }
}

class Pd10Length1 {
    public static void main(String[] args) {
        Cube c1 = new Cube(3, 5, 7);
        System.out.println("--- c1.show() ---");
        c1.show();
        c1.area();
    }
}

class Pd10Length2 {
    public static void main(String[] args) {
        Length[] ls;
        ls = new Length[4];
        ls[0] = new Rectangle(15, 50);
        ls[1] = new Triangle(40, 20);
        ls[2] = new Cube(10, 30, 5);
        ls[3] = new Length(8, 6);
        //ここに追加する
    }
}

class Pd10test {
    public static void main(String[] args) {
        //インスタンスを作成する
        Base b1 = new Base();
        Base b2 = new Positive();
        //showNumの動作確認
        System.out.println("--- b1 ---");
        b1.showNum();
        System.out.println("--- b2 ---");
        b2.showNum();
        //setNumの動作確認
        System.out.println("--- 正の値の場合 ---");
        b2.setNum(7);
        b2.showNum();
        System.out.println("--- 負の値の場合 ---");
        b2.setNum(-3);
        b2.showNum();
    }
}
