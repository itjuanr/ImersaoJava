import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.awt.FontMetrics;

import javax.imageio.ImageIO;

public class StickerGenerator {
    

    public void cria(InputStream inputStream, String nomeArquivo, String titulo) throws Exception {
        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);
    
        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
    
        // copiar a imagem original pra novo imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);
    
        // configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setFont(fonte);
        FontMetrics fm = graphics.getFontMetrics(fonte);
        int larguraTexto = fm.stringWidth(titulo);
        
        // calcular posição x para centralizar o texto
        int x = (largura - larguraTexto) / 2;
        
        // configurar o contorno
        Color corContorno = Color.WHITE;
        Stroke contorno = new BasicStroke(6.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        graphics.setStroke(contorno);
        graphics.setColor(corContorno);
        
        // desenhar o contorno da frase
        graphics.drawString(titulo, x-2, novaAltura - 102);
        graphics.drawString(titulo, x-2, novaAltura - 98);
        graphics.drawString(titulo, x+2, novaAltura - 102);
        graphics.drawString(titulo, x+2, novaAltura - 98);
        
        // configurar a cor do texto
        Color corTexto = Color.RED;
        graphics.setColor(corTexto);
        
        // escrever a frase na nova imagem centralizada
        graphics.drawString(titulo, x, novaAltura - 100);
    
        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));
    }
}
