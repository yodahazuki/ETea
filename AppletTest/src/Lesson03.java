import java.awt.event.*;
import java.awt.*;
import java.applet.*;
//
//      図形処理　お絵かきソフトの作成
//
//        Lesson 3. マウスのイベントを捕捉しよう
//
//                Presented by GATOAN 2001
//
//
public class Lesson03 extends Applet
               implements MouseListener,MouseMotionListener {
  // 座標値データ
  int x1,y1;
  int x2,y2;
  //
  // コンストラクタ
  //      描画色に赤を指定する
  //      背景に白を指定する
  //      マウスイベントリスナーを装備する
  //
  public Lesson03() {
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
    x1 = x2 = e.getX();
    y1 = y2 = e.getY();
    paint(getGraphics());
  }
  //
  // mouseDragged
  //      マウスドラッグの際の処理
  //
  public void mouseDragged(MouseEvent e)  {
    e.consume();

    x2 = e.getX();
    y2 = e.getY();
    paint(getGraphics());

    x1 = e.getX();    // これが新たな始点になる
    y1 = e.getY();
  }
  //
  // mouseMoved
  //      マウス移動の際の処理（未設定）
  //
  public void mouseMoved(MouseEvent e)  {
  }
  //
  // mouseReleased
  //      マウスボタンを離した際の処理（未設定）
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
      g.drawLine(x1,y1,x2,y2);
  }
}