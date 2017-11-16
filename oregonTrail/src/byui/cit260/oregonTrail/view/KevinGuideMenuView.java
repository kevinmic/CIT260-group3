/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Queue;

/**
 *
 * @author jordan
 */
public class KevinGuideMenuView extends KevinView {
    public KevinGuideMenuView() {
        setMenu( new KevinMenu("Hire a Guide Menu",
                new KevinMenuItem[] {
                        new KevinMenuItem("Y", "Hire a Guide", this::setRiverGuideYes),
                        new KevinMenuItem("N", "Go without a Guuide", this::setRiverGuideNo),
                        new KevinMenuItem("Q", "Return to previous menu", () -> {})
                }
        ));


        Runnable setRiverGuideYes = this::setRiverGuideYes;

        /*
        Runnable set2 = new Runnable() {
            @Override
            public void run() {
                setRiverGuideYes();
            }
        };
        */


        setRiverGuideYes.run();
    }

    private void setRiverGuideYes() {
        System.out.println("*** setRiverGuideYes() function called ***");
    }

    private void setRiverGuideNo() {
        System.out.println("*** setRiverGuideNo() function called ***");
    }
}

        