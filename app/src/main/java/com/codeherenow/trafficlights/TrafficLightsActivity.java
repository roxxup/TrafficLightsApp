/*
 * Copyright (C) 2013 Code Here Now - A subsidiary of Mobs & Geeks
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file 
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package com.codeherenow.trafficlights;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Button;


public class TrafficLightsActivity extends Activity implements OnClickListener {
	private ImageView redImage;
	private ImageView yellowImage;
	private ImageView greenImage;

	private Button redButton;
	private Button yellowButton;
	private Button greenButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.traffic_lights);


        redImage = (ImageView) findViewById(R.id.image_red);
        yellowImage = (ImageView) findViewById(R.id.image_yellow);
        greenImage = (ImageView) findViewById(R.id.image_green);

        redButton = (Button) findViewById(R.id.Red_Button);
        yellowButton = (Button) findViewById(R.id.Yellow_Button);
        greenButton = (Button)findViewById(R.id.Green_Button);

        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        turnLightOff();
        if (v == redButton) {
            turnOnRedLight();

        }
        else if (v == yellowButton) {
            turnOnYellowLight();

        }
        else if (v == greenButton) {
            turnOnGreenLight();

        }

    }

    private void turnOnRedLight() {
        redImage.setImageResource(R.drawable.red_on);

    }
    private void turnOnYellowLight(){
        yellowImage.setImageResource(R.drawable.yellow_on);

    }
    private void turnOnGreenLight(){
        greenImage.setImageResource(R.drawable.green_on);
    }
    private void turnLightOff(){
        redImage.setImageResource(R.drawable.light_off);
        yellowImage.setImageResource(R.drawable.light_off);
        greenImage.setImageResource(R.drawable.light_off);



    }
}
