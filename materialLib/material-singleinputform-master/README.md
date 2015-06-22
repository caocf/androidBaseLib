material-singleinputform
=======================
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-material--singleinputform-blue.svg?style=flat)](https://android-arsenal.com/details/1/1163)

A single EditText instead of a classical form.

This Library is a library implementation of  [flavienlaurent's "Single input form"][1]

_Very inspired by the [Minimal Format Interface][2]._

Implement any form with only one EditText. The idea here is to pack a multiple input form in one field. As a result, the user input is easier and a more fluent process.

Also, [TextSwitcher][3] got completely rediscovered to animate the form: title, error message. It's very basic but simple to use.

Here is a video demonstrating a sample form:
http://youtu.be/A99g6NDvn_w

Information
----
I'm currently not actively developing this library because of school work. Until August I'll only merge pull requests. Thanks for your patience.

Demo
----
A demo app is available on Google Play:

[![Get it on Google Play](https://developer.android.com/images/brand/en_generic_rgb_wo_45.png)](https://play.google.com/store/apps/details?id=com.heinrichreimersoftware.singleinputform.example)

Screenshots
-----------

| Checkbox input | E-mail input | Password input |
|:-:|:-:|:-:|
| ![Checkbox input](http://i.imgur.com/lsSIFuV.png) | ![E-mail input](http://i.imgur.com/JFB1tTq.png) | ![Password input](http://i.imgur.com/BiLn77T.png) |
| [_CheckBoxStep.java_][CBS] | [_TextStep.java_][TS] | [_TextStep.java_][TS] |

Dependency
----------

*material-singleinputform* is available on Maven Central

**Gradle dependency:**

    dependencies {
	    compile 'com.heinrichreimersoftware.singleinputform:library:2.0.2'
    }

Get the latest dependency with ["Gradle, please"][GP]

How-To-Use
-----

**Step 1:** Your `Activity` must extend [`SingleInputFormActivity`][SIFA]:

    public class MainActivity extends SingleInputFormActivity {
        //...
    }

**Step 2:** Implement abstract methods:

    public class MainActivity extends SingleInputFormActivity{
	    private static final String DATA_KEY_EXAMPLE = "example";
	    
	    @Override
	    protected List<Step> getSteps(Context context){
	        List<Step> steps = new ArrayList<Step>();
	        
	        steps.add(
	            new TextStep(context, DATA_KEY_EXAMPLE, InputType.TYPE_CLASS_TEXT, R.string.example, R.string.example_error, R.string.example_details)
	        );
	        
	        //Add more steps here...
	        
	        return steps;
	    }
	    
	    @Override
	    protected void onFormFinished(Bundle data){
            //Get the form data
	        String text = TextStep.text(data, DATA_KEY_EXAMPLE);
	        //...
	    }
	}

**Step 3:** Theme:

    <style name="YourThemeForSingleInputFormActivity" parent="Theme.AppCompat.Light.NoActionBar">

        <!-- Used for: input field background -->
        <item name="colorPrimary">@color/material_bordeaux_500</item>

        <!-- Used for: form progress color, status bar color (API 21+) -->
        <item name="colorPrimaryDark">@color/material_bordeaux_700</item>

        <!-- Used for: title text color, error text color -->
        <item name="android:textColorPrimary">@color/material_bordeaux_800</item>

        <!-- Used for: details text color, step indicator text color -->
        <item name="android:textColorSecondary">@color/material_black_54</item>

        <!-- Used for: input text color, input widget color -->
        <item name="android:textColorPrimaryInverse">@color/material_white_100</item>

        <!-- Used for: input widget color -->
        <item name="android:textColorSecondaryInverse">@color/material_white_70</item>

    </style>

Changes
-------

* **Version 2.0:**
    * [`CheckBoxStep`][CBS] (#6)
    * [`SeekBarStep`][SBS] (#6)
    * Material design
    * Simplified themes (see the tutorial above)
    * Fixed bug #4
    * Fixed bug #5
* **Version 1.0:**
    * Initial release

Open source libraries
-------

_material-singleinputform_ uses the following open source libraries or files:

* [singleinputform][4] by [@Flavien Laurent][5] (Apache License 2.0)
* [DiscreteSeekBar][6] f by [@Gustavo Claramunt][7] (Apache License 2.0)
* [DateTimePicker][8] by [@Flavien Laurent][5] and [@Edison Wang][9] (Apache License 2.0)
* [NineOldAndroids][10] by [@Jake Wharton][11] (Apache License 2.0)

License
-------

    Copyright 2015 Heinrich Reimer

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
    
[1]: https://github.com/flavienlaurent/singleinputform
[2]: https://github.com/codrops/MinimalForm
[3]: http://developer.android.com/reference/android/widget/TextSwitcher.html
[CBS]: https://github.com/HeinrichReimer/Android-SingleInputForm/blob/master/library/src/main/java/com/heinrichreimersoftware/singleinputform/steps/CheckBoxStep.java
[TS]: https://github.com/HeinrichReimer/Android-SingleInputForm/blob/master/library/src/main/java/com/heinrichreimersoftware/singleinputform/steps/TextStep.java
[SBS]: https://github.com/HeinrichReimer/Android-SingleInputForm/blob/master/library/src/main/java/com/heinrichreimersoftware/singleinputform/steps/SeekBarStep.java
[SIFA]: https://github.com/HeinrichReimer/Android-SingleInputForm/blob/master/library/src/main/java/com/heinrichreimersoftware/singleinputform/SingleInputFormActivity.java
[GP]: http://gradleplease.appspot.com/#com.heinrichreimersoftware.singleinputform
[4]: https://github.com/flavienlaurent/singleinputform
[5]: https://github.com/flavienlaurent
[6]: https://github.com/AnderWeb/discreteSeekBar
[7]: https://github.com/AnderWeb
[8]: https://github.com/flavienlaurent/datetimepicker
[9]: https://github.com/edisonw
[10]: https://github.com/JakeWharton/NineOldAndroids
[11]: https://github.com/JakeWharton
