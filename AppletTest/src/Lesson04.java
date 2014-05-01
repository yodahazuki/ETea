import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.Vector;
//
//      図形処理　お絵かきソフトの作成
//
//        Lesson 4. 描画したものが消えないようにしよう
//
//                Presented by GATOAN 2001
//
//
public class Lesson04 extends Applet
                implements MouseListener,MouseMotionListener  {
  // 描画した図形の保管
  Vector shapes = new Vector();
  // 座標値データ
  int x1,y1;
  //
  // コンストラクタ
  //      描画色に赤を指定する
  //      背景に白を指定する
  //      マウスイベントリスナーを装備する
  //
  public Lesson04() {
    setForeground(Color.red);
    setBackground(Color.white);
    addMouseMotionListener(this);
    addMouseListener(this);
  }
  //
  // mousePressed
  //      マウスボタンを押した際の処理
  //
  public void mousePressed(MouseEvent e)  {
    e.consume();
    x1 = e.getX();
    y1 = e.getY();
    shapes.addElement(new Rectangle(x1,y1,x1,y1));

    paint(getGraphics());
  }
  //
  // mouseDragged
  //      マウスドラッグの際の処理
  //
  public void mouseDragged(MouseEvent e)  {
    e.consume();

    shapes.addElement(new Rectangle(x1,y1,e.getX(),e.getY()));
    x1 = e.getX();    // これが新たな始点になる
    y1 = e.getY();

    paint(getGraphics());
  }
  //
  // mouseMoved
  //      マウス移動の際の処理（未設定）
  //
  public void mouseMoved(MouseEvent e)  {
  }
  //
  // mouseReleased
  //      マウスボタンを離した際の処理（今は未設定）
  //
  public void mouseReleased(MouseEvent e) {
  }
  //
  // mouseEntered
  //      コンポーネントにマウス侵入の際の処理（未設定）
  //
  public void mouseEntered(MouseEvent e)  {
  }
  //
  // mouseExited
  //      コンポーネントからマウス脱出の際の処理（未設定）
  //
  public void mouseExited(MouseEvent e) {
  }
  //
  // mouseClicked
  //      マウスクリックの際の処理（未設定）
  //
  public void mouseClicked(MouseEvent e)  {
  }
  //
  // paint
  //      描画処理
  //
  public void paint(Graphics g) {
    int number = shapes.size();
    for (int i = 0;i < number;i++)  {
      Rectangle data = (Rectangle)shapes.elementAt(i);
      g.drawLine(data.x,data.y,data.width,data.height);
    }
  }
}