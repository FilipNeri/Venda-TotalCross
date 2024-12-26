package com.totalcross.store.view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.totalcross.store.model.Product;
import com.totalcross.store.ui.colors.Colors;

import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.util.UnitsConverter;

public class ProductsScreen extends Container {
    private Button btnRed;

    public ProductsScreen() {
        ArrayList<Product> listProducts = new ArrayList<Product>();
        Date now = new Date();
        listProducts.add(new Product(1, now, "Produto que faz tal coisa", "Produto 1", new BigDecimal(20.00)));
        listProducts.add(new Product(2, now, "Produto que faz tal coisa", "Produto 2", new BigDecimal(25.50)));
        listProducts.add(new Product(3, now, "Produto que faz tal coisa", "Produto 3", new BigDecimal(300.00)));
        listProducts.add(new Product(4, now, "Produto que faz tal coisa", "Produto 4", new BigDecimal(0.50)));
        listProducts.add(new Product(5, now, "Produto que faz tal coisa", "Produto 5", new BigDecimal(10.00)));
    }

    @Override
    public void initUI() {
        super.initUI();
        setBackColor(Color.getRGB(240, 240, 240));

        // Criação da Toolbar
        Container toolbar = new Container();
        toolbar.setBackColor(Colors.PURPLE); // Azul
        add(toolbar, LEFT, TOP, FILL, DP + 50); // Altura de 50 DP

        // Texto centralizado na Toolbar
        Label toolbarText = new Label("PRODUTOS");
        toolbarText.setForeColor(Color.WHITE); // Cor do texto
        toolbarText.setFont(Font.getFont("Lato Bold", true, Font.NORMAL_SIZE + 2)); // Fonte maior
        toolbar.add(toolbarText, CENTER, CENTER);
            /* 
            int gap = UnitsConverter.toPixels(DP + 16);
            //inserindo margem
            sc.setInsets(gap, gap, gap, gap);
            add(sc, LEFT, TOP, FILL, FILL);

            Button b;
            ScrollContainer sc1, sc2, sc3;
            // a ScrollContainer with both ScrollBars
            sc.add(sc1 = new ScrollContainer());
            sc1.setBorderStyle(BORDER_ROUNDED);
            sc1.setInsets(3, 3, 3, 3);
            sc1.setRect(LEFT, AFTER, FILL, SCREENSIZE + 30);
            int xx = new Label("Name99").getPreferredWidth() + 2; // edit's alignment
            for (int i = 0; i < 50; i++) {
                sc1.add(new Label("Name" + i), LEFT, AFTER + 10);
                sc1.add(new Edit(), xx, SAME, SCREENSIZE + 90, PREFERRED);
                if (i % 3 == 0) {
                    sc1.add(new Button("Go"), AFTER + 2, SAME, PREFERRED, SAME);
                }
            }

            // a ScrollContainer with vertical ScrollBar disabled
            sc.add(new Label("Horizontal-only:"), LEFT, AFTER + gap);
            sc.add(sc2 = new ScrollContainer(true, false));
            sc2.setBorderStyle(BORDER_ROUNDED);
            sc2.setInsets(3, 3, 3, 3);
            int lines = Settings.screenHeight > 320 ? 4 : 3;
            sc2.setRect(LEFT, AFTER, FILL, lines * (fmH + Edit.prefH) + fmH / 2);
            for (int i = 0; i < lines; i++) {
                sc2.add(new Label("Name" + i), LEFT, AFTER);
                sc2.add(new Edit(""), xx, SAME, PARENTSIZE + 200, PREFERRED); // fit
                sc2.add(new Button("Go"), AFTER, SAME, PREFERRED, SAME);
            }

            // a ScrollContainer with horizontal ScrollBar disabled
            sc.add(new Label("Vertical-only:"), LEFT, AFTER + gap);
            sc.add(sc3 = new ScrollContainer(false, true));
            sc3.setBorderStyle(BORDER_ROUNDED);
            sc3.setInsets(3, 3, 3, 3);
            sc3.setRect(LEFT, AFTER, FILL, SCREENSIZE + 30);
            for (int i = 0; i < 50; i++) {
                sc3.add(new Label("Name" + i), LEFT, AFTER);
                sc3.add(b = new Button("Go"), RIGHT, SAME, PREFERRED, SAME);
                sc3.add(new Edit(""), xx, SAME, FIT - 2, PREFERRED, b); // fit
            }
                */

    }

    private Container toolbar(){
        Container cToolbar = new Container();
        cToolbar.setBackColor(Colors.PURPLE);
        return cToolbar;
    }
    private Label lToolbar(){
        Label lTitle = new Label("PRODUTOS");
        lTitle.fillColor = Colors.WHITE;
        lTitle.setFont(font);
        return lTitle;
    }
}
