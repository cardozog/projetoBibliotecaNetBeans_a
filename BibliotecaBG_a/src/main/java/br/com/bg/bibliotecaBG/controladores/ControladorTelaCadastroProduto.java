package br.com.bg.bibliotecaBG.controladores;

import br.com.bg.bibliotecaBG.dominio.Produto;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme C
 */
public class ControladorTelaCadastroProduto {
    private JTextField jtfNome;
    private JComboBox jcbCategoria;
    private Produto produto;
    public ControladorTelaCadastroProduto(JTextField jtfNome, JComboBox jcbCategoria) {
        this.jtfNome = jtfNome;
        this.jcbCategoria = jcbCategoria;
    }


    
    
    private void preencherProduto(){
    
        produto = new Produto();
        produto.setNome(this.jtfNome.getText());
        produto.setCategoria(jcbCategoria.getSelectedItem().toString());
    
    }
}
