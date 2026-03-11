import java.awt.*; //ferramentas pra desenho e cores
import java.awt.event.*;//cliques, fechar, etc
import javax.swing.*;//ferramentas pra criar a janela Jframe

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        //ouvinte pra quando fechar a janela
        this.addWindowListener (
            new WindowAdapter() {
                //quando o evento de fechar ocorrer, encerra o processo
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        //define o texto na janela
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        //comando this.getContentPane().setBackground(suaCor); pra mudar o fundo com cores rgb
        this.getContentPane().setBackground(new Color(200, 230, 255));

        this.setVisible(true); //torna a janela visivel
    }

    public void paint (Graphics g) {
        super.paint(g); //limpa a lousa
        Graphics2D g2d = (Graphics2D) g; //converte o pincel

        g2d.setStroke(new BasicStroke(5));

        int w = getWidth();
        int h = getHeight();
        
        //um retângulo vermelho
        g2d.setPaint(Color.red);
        g2d.fillRect(w/4, h/4, w/2, h/2);
        
        //linhas verdes por cima do retângulo vermelho
        g2d.setPaint(Color.green);
        //desenha uma linha da esquerda-superior (0,0) até a direita-inferior (w,h)
        g2d.drawLine(0,0, w,h);
        //desenha uma linha da esquerda-inferior (0,h) até a direita-superior (w,0)
        g2d.drawLine(0,h, w,0);

    }
}
