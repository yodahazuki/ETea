import java.awt.event.*;
import java.awt.*;
import java.applet.*;
//
//      �}�`�����@���G�����\�t�g�̍쐬
//
//        Lesson 3. �}�E�X�̃C�x���g��ߑ����悤
//
//                Presented by GATOAN 2001
//
//
public class Lesson03 extends Applet
               implements MouseListener,MouseMotionListener {
  // ���W�l�f�[�^
  int x1,y1;
  int x2,y2;
  //
  // �R���X�g���N�^
  //      �`��F�ɐԂ��w�肷��
  //      �w�i�ɔ����w�肷��
  //      �}�E�X�C�x���g���X�i�[�𑕔�����
  //
  public Lesson03() {
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
    x1 = x2 = e.getX();
    y1 = y2 = e.getY();
    paint(getGraphics());
  }
  //
  // mouseDragged
  //      �}�E�X�h���b�O�̍ۂ̏���
  //
  public void mouseDragged(MouseEvent e)  {
    e.consume();

    x2 = e.getX();
    y2 = e.getY();
    paint(getGraphics());

    x1 = e.getX();    // ���ꂪ�V���Ȏn�_�ɂȂ�
    y1 = e.getY();
  }
  //
  // mouseMoved
  //      �}�E�X�ړ��̍ۂ̏����i���ݒ�j
  //
  public void mouseMoved(MouseEvent e)  {
  }
  //
  // mouseReleased
  //      �}�E�X�{�^���𗣂����ۂ̏����i���ݒ�j
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
      g.drawLine(x1,y1,x2,y2);
  }
}