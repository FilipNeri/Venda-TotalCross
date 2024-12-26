package com.totalcross.store;
import com.totalcross.store.ui.fonts.Fonts;
import com.totalcross.store.view.ProductsScreen;

import totalcross.sys.Settings;
import totalcross.ui.MainWindow;
import totalcross.ui.Window;
import totalcross.ui.font.Font;


public class StoreWMW extends MainWindow {


    public StoreWMW() {
        setUIStyle(Settings.MATERIAL_UI);
        setDefaultFont(Font.getFont(Fonts.FONT_DEFAULT_SIZE));
    }

    @Override
    public void initUI() {
        ProductsScreen productsScreen = new ProductsScreen();
        MainWindow.getMainWindow().swap(productsScreen);
    }

}
