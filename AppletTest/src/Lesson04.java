import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.Vector;
//
//      �}�`�����@���G�����\�t�g�̍쐬
//
//        Lesson 4. �`�悵�����̂������Ȃ��悤�ɂ��悤
//
//                Presented by GATOAN 2001
//
//
public class Lesson04 extends Applet
                implements MouseListener,MouseMotionListener  {
  // �`�悵���}�`�̕ۊ�
  Vector shapes = new Vector();
  // ���W�l�f�[�^
  int x1,y1;
  //
  // �R���X�g���N�^
  //      �`��F�ɐԂ��w�肷��
  //      �w�i�ɔ����w�肷��
  //      �}�E�X�C�x���g���X�i�[�𑕔�����
  //
  public Lesson04() {
    setForeground(Color.red);
    setBackground(Color.white);
    addMouseMotionListener(this);
    addMouseListener(this);
  }
  //
  // mousePressed
  //      �}�E�X�{�^�����������ۂ̏���
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
  //      �}�E�X�h���b�O�̍ۂ̏���
  //
  public void mouseDragged(MouseEvent e)  {
    e.consume();

    shapes.addElement(new Rectangle(x1,y1,e.getX(),e.getY()));
    x1 = e.getX();    // ���ꂪ�V���Ȏn�_�ɂȂ�
    y1 = e.getY();

    paint(getGraphics());
  }
  //
  // mouseMoved
  //      �}�E�X�ړ��̍ۂ̏����i���ݒ�j
  //
  public void mouseMoved(MouseEvent e)  {
  }
  //
  // mouseReleased
  //      �}�E�X�{�^���𗣂����ۂ̏����i���͖��ݒ�j
  //
  public void mouseReleased(MouseEvent e) {
  }
  //
  // mouseEntered
  //      �R���|�[�l���g�Ƀ}�E�X�N���̍ۂ̏����i���ݒ�j
  //
  public void mouseEntered(MouseEvent e)  {
  }
  //
  // mouseExited
  //      �R���|�[�l���g����}�E�X�E�o�̍ۂ̏����i���ݒ�j
  //
  public void mouseExited(MouseEvent e) {
  }
  //
  // mouseClicked
  //      �}�E�X�N���b�N�̍ۂ̏����i���ݒ�j
  //
  public void mouseClicked(MouseEvent e)  {
  }
  //
  // paint
  //      �`�揈��
  //
  public void paint(Graphics g) {
    int number = shapes.size();
    for (int i = 0;i < number;i++)  {
      Rectangle data = (Rectangle)shapes.elementAt(i);
      g.drawLine(data.x,data.y,data.width,data.height);
    }
  }
}