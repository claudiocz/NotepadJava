package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad extends JFrame {

    private JMenuBar menuBar;

    //Menu1 File
    private JMenu menuFile;
    private JMenuItem new1;
    private JMenuItem open;
    private JMenuItem save;
    private JMenuItem howSave;
    private JMenuItem config;
    private JMenuItem print;
    private JMenuItem exit;

    //menu 2 Edit
    private JMenu menuEdit;
    private JMenuItem undo;
    private JMenuItem cut;
    private JMenuItem copy;
    private JMenuItem paste;
    private JMenuItem delete;
    private JMenuItem search;
    private JMenuItem searchNext;
    private JMenuItem remplace;
    private JMenuItem goTo;
    private JMenuItem selectAll;
    private JMenuItem dateAndHour;

    //menu 3 Format
    private JMenu menuFormat;
    private JMenuItem wordWrap;
    private JMenuItem font;

    //menu 4 View
    private JMenu menuView;
    private JMenuItem statusBar;

    //menu 5 Help
    private JMenu menuHelp;
    private JMenuItem seeHelp;
    private JMenuItem aboutNotepad;

    //Area de texto
    private JTextArea editableArea;

    public Notepad() {
        super("Notepad Untitle...");
        setVisible(true);
        setSize(900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        editableArea = new JTextArea();
        editableArea.setBounds(20, 500, 0, 0);
        add(editableArea);

        // Inicializanco los Menus
        menuFile = new JMenu("Archivo");
        menuEdit = new JMenu("Editar");
        menuFormat = new JMenu("Formato");
        menuView = new JMenu("Ver");
        menuHelp = new JMenu("Ayuda");


        //MENU FILE
        menuBar.add(menuFile);
        new1 = new JMenuItem("Nuevo           Ctrl + N");
        open = new JMenuItem("Abrir              Ctrl + A");
        save = new JMenuItem("Guardar        Ctrl + G");
        howSave = new JMenuItem("Guardar como...");
        config = new JMenuItem("Configurar página...");
        print = new JMenuItem("Imprimir...     Ctrl + P");
        exit = new JMenuItem("Salir");

        //agregando los items al menu
        menuFile.add(new1);
        menuFile.add(open);
        menuFile.add(save);
        menuFile.add(howSave);
        menuFile.addSeparator();
        menuFile.add(config);
        menuFile.add(print);
        menuFile.addSeparator();
        menuFile.add(exit);


        //MENU EDIT
        menuBar.add(menuEdit);
        undo = new JMenuItem("Deshacer     Ctrl + Z");
        cut = new JMenuItem("Cortar      Ctrl + X");
        copy = new JMenuItem("Copiar     Ctrl + C");
        paste = new JMenuItem("Pegar     Ctrl + V");
        delete = new JMenuItem("Eliminar     Supr");
        search = new JMenuItem("Buscar...     Ctrl + B");
        searchNext = new JMenuItem("Buscar siguiente   F3");
        remplace = new JMenuItem("Reemplazar...       Ctrl + R");
        goTo = new JMenuItem("Ir a...                  Ctrl + T");
        selectAll = new JMenuItem("Seleccionar todo    Ctrl + E");
        dateAndHour = new JMenuItem("Hora y fecha           F5");

        //agregando los items al menu
        menuEdit.add(undo);
        menuEdit.addSeparator();
        menuEdit.add(cut);
        menuEdit.add(copy);
        menuEdit.add(paste);
        menuEdit.add(delete);
        menuEdit.addSeparator();
        menuEdit.add(search);
        menuEdit.add(searchNext);
        menuEdit.add(remplace);
        menuEdit.add(goTo);
        menuEdit.addSeparator();
        menuEdit.add(selectAll);
        menuEdit.add(dateAndHour);

        //MENU FORMAT
        menuBar.add(menuFormat);
        wordWrap = new JMenuItem("Ajuste de Linea");
        font = new JMenuItem("Fuente...");

        menuFormat.add(wordWrap);
        menuFormat.add(font);

        menuBar.add(menuView);
        statusBar = new JMenuItem("Barra de estado");

        menuView.add(statusBar);

        //MENU HELP
        menuBar.add(menuHelp);
        seeHelp = new JMenuItem("Ver la Ayuda");
        aboutNotepad = new JMenuItem("acerca de Notepad");
        menuHelp.add(seeHelp);
        menuHelp.add(aboutNotepad);


        //ACCIONES PARA LOS ITEMS
        new1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Notepad nuevo = new Notepad();
                nuevo.setVisible(true);

            }
        });


        //salir de Notepad
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }


}
