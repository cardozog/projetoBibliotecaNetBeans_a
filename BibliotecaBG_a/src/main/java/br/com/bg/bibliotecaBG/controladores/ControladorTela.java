/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.bibliotecaBG.controladores;

import br.com.bg.bibliotecaBG.telas.TelaCadastroUsuario;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme c
 */
public abstract class ControladorTela {

    private String mensagem;
    private JFrame telaPrincipal;
    private JDesktopPane jdpTelaFilha;
    private TelaCadastroUsuario telaCadastroUsuario;

    public ControladorTela(JFrame telaPrincipal, JDesktopPane jdpTelaCadastroCliente) {
        this.telaPrincipal = telaPrincipal;
        this.jdpTelaFilha = jdpTelaFilha;
    }

    public void exibirTelaCadastroUsuario() {
        if (telaCadastroUsuario == null) {
            telaCadastroUsuario = new TelaCadastroUsuario();
            jdpTelaFilha.add(telaCadastroUsuario);
            telaCadastroUsuario.setVisible(true);
            moverTelaParaFrenteOuParaTras(telaCadastroUsuario);
        }
    }

    private void moverTelaParaFrenteOuParaTras(JInternalFrame tela) {
        if (tela != null) {
            tela.moveToFront();
        } else {
            tela.moveToBack();
        }
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jdpTelaFilha.getDesktopManager().activateFrame(tela);
        try{
            tela.setSelected(true);
            tela.setMaximum(true);
        }   catch (PropertyVetoException ex){
            Logger.getLogger(ControladorTela.class.getName())
                    .log(Level.SEVERE,null,ex);
                    
        }
        
    }
    private void fechar (){
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }
    
}
