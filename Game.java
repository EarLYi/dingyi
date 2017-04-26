/*
    * 创建一个类Game，石头，剪刀，布的游戏。

    */

    public class Game {

    /**

    * @param args

    */

    String[] s ={"石头","剪刀","布"};

    //获取电脑出拳

    String getComputer(int i)

    {

    String computerGuess = s[i];

    return computerGuess;

    }

    //判断人出拳是否为石头，剪刀，布

    boolean isOrder(String guess)

    {

    boolean b = false;

    for(int x = 0;x < s.length; x++)

    {

    if(guess.equals(s[x]))

    {

    b = true;

    break;

    }

    }

    return b;

    }

    //比较

    void winOrLose(String guess1,String guess2)

    {

    if(guess1.equals(guess2))

    {

    System.out.println("你出：" + guess1 + "，电脑出：" + guess2 + "。平了");

    }else if(guess1.equals("石头"))

    {

    if(guess2.equals("剪刀"))

    {

    System.out.println("你出：" + guess1 + "，电脑出：" + guess2 + "。You Win!");

    }else

    {

    System.out.println("你出：" + guess1 + "，电脑出：" + guess2 + "。You Lose!");

    }

    }else if(guess1.equals("剪刀"))

    {

    if(guess2.equals("布"))

    {

    System.out.println("你出：" + guess1 + "，电脑出：" + guess2 + "。You Win!");

    }else

    {

    System.out.println("你出：" + guess1 + "，电脑出：" + guess2 + "。You Lose!");

    }

    }else if(guess1.equals("布"))

    {

    if(guess2.equals("石头"))

    {

    System.out.println("你出：" + guess1 + "，电脑出：" + guess2 + "。You Win!");

    }else

    {

    System.out.println("你出：" + guess1 + "，电脑出：" + guess2 + "。You Lose!");

    }

    }

    }

    public static void main(String[] args) {

    Game my = new Game();

    Game computer = new Game();

    Game game = new Game();

    String myGuess = javax.swing.JOptionPane.showInputDialog("输入石头，剪刀，布：");

    String computerGuess = computer.getComputer((int)(Math.floor(Math.random()*3)));

    if(my.isOrder(myGuess))

    {

    game.winOrLose(myGuess, computerGuess);

    }else

    {

    System.out.println("你输入的不是石头，剪刀，布！");

    }

    }

    }