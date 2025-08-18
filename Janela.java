import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        
        if (janela.width > screen.width) 
            setSize(screen.width, janela.height);
            setLocation((screen.width - janela.width) / 2,
                    (screen.height - janela.height) / 2);
        
    }
    public class Agencia {
        JLabel Jlagencia;
        JTextField Jtfagencia;
        public Agencia() {
            Jlagencia = new JLabel("Código da agência:");
            Jlagencia.setBounds(10, 10, 110, 18);
            Jtfagencia = new JTextField(10);
            Jtfagencia.setBounds(125, 10, 50, 20);
        }
    }

    public class Conta {
        JLabel Jlconta;
        JTextField Jtfconta;
        public Conta() {
            Jlconta = new JLabel("Número da conta:");
            Jlconta.setBounds(205, 10, 105, 18);
            Jtfconta = new JTextField(10);
            Jtfconta.setBounds(315, 10, 60, 20);
        }
    }

    public class Separator01 {
        JSeparator separator01;
        public Separator01() {
            separator01 = new JSeparator();
            separator01.setBounds(10, 40, 365, 10);
        }
    }

    public class Nome {
        JLabel Jlnome;
        JTextField Jtfnome;
        public Nome() {
            Jlnome = new JLabel("Nome:");
            Jlnome.setBounds(10, 50, 60, 18);
            Jlnome.setHorizontalAlignment(SwingConstants.RIGHT);
            Jtfnome = new JTextField(30);
            Jtfnome.setBounds(75, 50, 300, 20);
        }
    }
    public class Endereço {
        JLabel Jlendereco;
        JTextField Jtfendereco;
        public Endereço() {
            Jlendereco = new JLabel("Endereço:");
            Jlendereco.setBounds(10, 75, 60, 18);
            Jlendereco.setHorizontalAlignment(SwingConstants.RIGHT);
            Jtfendereco = new JTextField(30);
            Jtfendereco.setBounds(75, 75, 300, 20);
        }
    }

    public class Telefone {
        JLabel Jltelefone;
        JTextField Jtftelefone;
        public Telefone() {
            Jltelefone = new JLabel("Telefone:");
            Jltelefone.setBounds(10, 100, 60, 18);
            Jltelefone.setHorizontalAlignment(SwingConstants.RIGHT);
            Jtftelefone = new JTextField(15);
            Jtftelefone.setBounds(75, 100, 300, 20);
        }
    }

    public class CPF {
        JLabel Jlcpf;
        JTextField Jtfcpf;
        public CPF() {
            Jlcpf = new JLabel("CPF:");
            Jlcpf.setBounds(10, 125, 60, 18);
            Jlcpf.setHorizontalAlignment(SwingConstants.RIGHT);
            Jtfcpf = new JTextField(15);
            Jtfcpf.setBounds(75, 125, 300, 20);
        }
    }

    public class RadioButtonGroup {
        JRadioButton JrbCorrente;
        JRadioButton JrbPoupanca;
        ButtonGroup btngroup;
        public RadioButtonGroup() {
            JrbCorrente = new JRadioButton("Conta Corrente");
            JrbCorrente.setBounds(100, 150, 111, 20);
            JrbPoupanca = new JRadioButton("Conta Poupança");
            JrbPoupanca.setBounds(225, 150, 118, 20);
            btngroup = new ButtonGroup();
            btngroup.add(JrbCorrente);
            btngroup.add(JrbPoupanca);
            JrbCorrente.setSelected(true);
        }
    }

    public class Separator02 {
        JSeparator separator02;
        public Separator02() {
            separator02 = new JSeparator();
            separator02.setBounds(10, 180, 365, 10);
        }
    }

    public class Atualizar {
        JButton Jbatualizar;
        public Atualizar() {
            Jbatualizar = new JButton("Atualizar");
            Jbatualizar.setBounds(145, 190, 100, 23);
            Jbatualizar.setEnabled(false);
        }
    }

    public class Consultar {
        JButton Jbconsultar;
        public Consultar() {
            Jbconsultar = new JButton("Consultar");
            Jbconsultar.setBounds(35, 190, 100, 23);
        }
    }

    public class Fechar {
        JButton Jbfechar;
        public Fechar() {
            Jbfechar = new JButton("Fechar");
            Jbfechar.setBounds(255, 190, 100, 23);
            Jbfechar.addActionListener(e -> System.exit(0));
        }
    }
    public Janela() {
        Agencia agencia = new Agencia();
        Conta conta = new Conta();
        Separator01 separator01 = new Separator01();
        Endereço endereco = new Endereço();
        Nome nome = new Nome();
        Telefone telefone = new Telefone();
        CPF cpf = new CPF();
        RadioButtonGroup radiobuttongroup = new RadioButtonGroup();
        Separator02 separator02 = new Separator02();
        Atualizar atualizar = new Atualizar();
        Consultar consultar = new Consultar();
        Fechar fechar = new Fechar();
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 255);
        centralizar();
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        getContentPane().add(agencia.Jlagencia);
        getContentPane().add(agencia.Jtfagencia);
        getContentPane().add(conta.Jlconta);
        getContentPane().add(conta.Jtfconta);
        getContentPane().add(separator01.separator01);
        getContentPane().add(nome.Jlnome);
        getContentPane().add(nome.Jtfnome);
        getContentPane().add(endereco.Jlendereco);
        getContentPane().add(endereco.Jtfendereco);
        getContentPane().add(telefone.Jltelefone);
        getContentPane().add(telefone.Jtftelefone);
        getContentPane().add(cpf.Jlcpf);
        getContentPane().add(cpf.Jtfcpf);
        getContentPane().add(radiobuttongroup.JrbCorrente);
        getContentPane().add(radiobuttongroup.JrbPoupanca);
        getContentPane().add(separator02.separator02);
        getContentPane().add(atualizar.Jbatualizar);
        getContentPane().add(consultar.Jbconsultar);
        getContentPane().add(fechar.Jbfechar);
    }

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}