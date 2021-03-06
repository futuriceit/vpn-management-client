package com.futurice.intra.vpn.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by konstantin.petrukhnov@futurice.com on 2015-09-04.
 */
@Slf4j
public class WizardStep4ResultController extends AbstractWizardStepController {

    @FXML
    private Label resultText;

    @Override
    public void onShow() {
        resultText.setText(config.getFinishingText());
    }

}


