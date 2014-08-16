package com.example.unitconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Spinner spnParent, spnChild1, spnChild2;
	private EditText input1, input2;
	private Button Clear, Swap, Convert;

	String val2, forResult;
	// double val1;

	String from, to, entervalue;
	// data source;
	public static String[] unit = { "1.Temperature Converter",
			"2.Height Converter", "3.Weight Converter", "4.Angle Converter",
			"5.Area Converter", "6.Time Converter", "7.Byte Converter",
			"8.Density Converter", "9.Power Converter", "10.Force Converter",
			"11.Volume Converter", "12.Electric Current Converter",
			"13.Speed Converter", "14.Energy Converter",
			"15.Pressure Converter", "16.Radioactivity Converter",
			"17.Frequency Converter", "18.Light illumination Converter",
			"19.Inductance Converter", "20. Currancy Converter",
			"21.Sound Converter" ,"22.Molar Mass Converter"};
	public static String[] unit1 = { "Kelvin", "Farenhite", "Celcious",
			"Meter", "Centimeter", "Kilometer" };
	public static String[] unit2 = { "Kelvin", "Farenhite", "Celcious",
			"Meter", "Centimeter", "Kilometer" };
	// adapter
	ArrayAdapter<String> adapter;
	ArrayAdapter<String> adapter1;
	ArrayAdapter<String> adapter2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spnParent = (Spinner) findViewById(R.id.spnParent);
		spnChild1 = (Spinner) findViewById(R.id.spnChild1);
		spnChild2 = (Spinner) findViewById(R.id.spnChild2);
		input1 = (EditText) findViewById(R.id.input1);
		input2 = (EditText) findViewById(R.id.input2);
		Clear = (Button) findViewById(R.id.Clear);

		Swap = (Button) findViewById(R.id.Swap);

		adapter = new ArrayAdapter<String>(MainActivity.this,
				android.R.layout.simple_list_item_1, unit);
		spnParent.setAdapter(adapter);
		spnParent.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {

				if (spnParent.getSelectedItem().equals(
						"1.Temperature Converter")) {
					String[] unit1 = { "Kelvin", "Farenhite", "Celcious" };
					String[] unit2 = { "Kelvin", "Farenhite", "Celcious" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"2.Height Converter")) {
					String[] unit1 = { "Feet", "Inch", "Centimeter" };
					String[] unit2 = { "Feet", "Inch", "Centimeter" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"3.Weight Converter")) {
					String[] unit1 = { "Kilogram", "Gram", "Pound" };
					String[] unit2 = { "Kilogram", "Gram", "Pound" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"4.Angle Converter")) {
					String[] unit1 = { "Degree", "Radian" };
					String[] unit2 = { "Degree", "Radian" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"5.Area Converter")) {
					String[] unit1 = { "Hectares", "Acres", "Square Meter",
							"Square Feet" };
					String[] unit2 = { "Hectares", "Acres", "Square Meter",
							"Square Feet" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"6.Time Converter")) {
					String[] unit1 = { "Day", "Hour", "Minute", "Second" };
					String[] unit2 = { "Day", "Hour", "Minute", "Second" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"7.Byte Converter")) {
					String[] unit1 = { "Byte", "Kilobyte", "Megabyte",
							"Gigabyte" };
					String[] unit2 = { "Byte", "Kilobyte", "Megabyte",
							"Gigabyte" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"8.Density Converter")) {
					String[] unit1 = { "gm/m3", "gm/cm3", "kg/m3", "kg/cm3" };
					String[] unit2 = { "gm/m3", "gm/cm3", "kg/m3", "kg/cm3" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"9.Power Converter")) {
					String[] unit1 = { "Watt", "Kilowatt", "Megawatt",
							"Horsepower" };
					String[] unit2 = { "Watt", "Kilowatt", "Megawatt",
							"Horsepower" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"10.Force Converter")) {
					String[] unit1 = { "Newton", "Kilonewton", "Dyne" };
					String[] unit2 = { "Newton", "Kilonewton", "Dyne" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"11.Volume Converter")) {
					String[] unit1 = { "Cubic Meter", "Cubic Centimeter",
							"Cubic Yard", "Liter" };
					String[] unit2 = { "Cubic Meter", "Cubic Centimeter",
							"Cubic Yard", "Liter" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"12.Electric Current Converter")) {
					String[] unit1 = { "Ampere", "Kiloampere", "Miliampere",
							"Biot" };
					String[] unit2 = { "Ampere", "Kiloampere", "Miliampere",
							"Biot" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"13.Speed Converter")) {
					String[] unit1 = { "km/hour", "km/sec", "m/sec", "m/min" };
					String[] unit2 = { "km/hour", "km/sec", "m/sec", "m/min" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"14.Energy Converter")) {
					String[] unit1 = { "Calorie", "Joule" };
					String[] unit2 = { "Calorie", "Joule" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"15.Pressure Converter")) {
					String[] unit1 = { "atmosphere", "pascal", "torr", "bar" };
					String[] unit2 = { "atmosphere", "pascal", "torr", "bar" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"16.Radioactivity Converter")) {
					String[] unit1 = { "Curie", "Becquerel", "Rutherford" };
					String[] unit2 = { "Curie", "Becquerel", "Rutherford" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"17.Frequency Converter")) {
					String[] unit1 = { "hertz", "kilohertz", "megahertz" };
					String[] unit2 = { "hertz", "kilohertz", "megahertz" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"18.Light illumination Converter")) {
					String[] unit1 = { "lumen/square centimeter",
							"lumen/square meter", "lux" };
					String[] unit2 = { "lumen/square centimeter",
							"lumen/square meter", "lux" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"19.Inductance Converter")) {
					String[] unit1 = { "Henry", "Microhenry", "Millihenry" };
					String[] unit2 = { "Henry", "Microhenry", "Millihenry" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else if (spnParent.getSelectedItem().equals(
						"20. Currancy Converter")) {
					String[] unit1 = { "US Dollar", "British Pound",
							"Bangladesh Taka", "India Rupee" };
					String[] unit2 = { "US Dollar", "British Pound",
							"Bangladesh Taka", "India Rupee" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				} else if (spnParent.getSelectedItem().equals(
						"21.Sound Converter")) {
					
					String[] unit1 = { "bel","decibel" };
					String[] unit2 = { "bel","decibel" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}
				else if (spnParent.getSelectedItem().equals(
						"22.Molar Mass Converter")) {
					
					String[] unit1 = { "g/mol","kg/mol" };
					String[] unit2 = { "g/mol","kg/mol" };
					adapter1 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit1);
					spnChild1.setAdapter(adapter1);
					adapter2 = new ArrayAdapter<String>(MainActivity.this,
							android.R.layout.simple_list_item_1, unit2);
					spnChild2.setAdapter(adapter2);

				}

				else {

					Toast.makeText(getApplicationContext(),
							"failed to convert", Toast.LENGTH_LONG).show();
				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}

		});
	}

	public void Clear(View v) {
		input1.setText("");
		input2.setText("");

	}

	public void Swap(View v) {
		int spnChild11Index = spnChild1.getSelectedItemPosition();

		spnChild1.setSelection(spnChild2.getSelectedItemPosition());
		spnChild2.setSelection(spnChild11Index);

	}

	public void Convert(View v) {

		float value = 0;
		String from = "";
		String to = "";
		String entervalue = input1.getText().toString();
		if (entervalue.equals("") || entervalue == null) {
			Toast.makeText(this, "Your field is empty", Toast.LENGTH_SHORT)
					.show();
			// Log.d("tag", "Your field is empty");
			return;
		}
		float num = Float.valueOf(entervalue);
		from = spnChild1.getSelectedItem().toString();
		to = spnChild2.getSelectedItem().toString();
		// switcher(from,to);

		if (from.equals("Celcious")) {
			if (to.equals("Farenhite")) {
				value = CelltoFar(num);

			} else {
				value = CelltoKel(num);
			}

		} else if (from.equals("Farenhite")) {
			if (to.equals("Celcious")) {
				value = FartoCell(num);
			} else {
				value = FartoKell(num);
			}

		} else if (from.equals("Kelvin")) {

			if (to.equals("Celcious")) {
				value = KelltoCell(num);
			} else {
				value = KelltoFar(num);
			}
		} else if (from.equals("Degree")) {
			if (to.equals("Radian")) {
				value = DegtoRad(num);
			}

			else {
				value = RadtoDeg(num);
			}
		
		} else if (from.equals("Radian")) {
			if (to.equals("Degree")) {
				value = RadtoDeg(num);
			}

			else {
				value = DegtoRad(num);
			}
		
		}
		
		else if (from.equals("Feet")) {
			if (to.equals("Inch")) {
				value = FtoI(num);
			} else {
				value = FtoC(num);
			}
		} else if (from.equals("Inch")) {
			if (to.equals("Feet")) {
				value = ItoF(num);
			} else {
				value = ItoC(num);
			}
		} else if (from.equals("Centimeter")) {
			if (to.equals("Feet")) {
				value = CtoF(num);
			} else {
				value = CtoI(num);
			}

		} else if (from.equals("Kilogram")) {
			if (to.equals("Gram")) {
				value = KtoG(num);
			} else {
				value = KtoP(num);
			}
		} else if (from.equals("Gram")) {
			if (to.equals("Kilogram")) {
				value = GtoK(num);
			} else {
				value = GtoP(num);
			}
		} else if (from.equals("Pound")) {
			if (to.equals("Kilogram")) {
				value = PtoK(num);
			} else {
				value = PtoG(num);
			}
		} else if (from.equals("Hectares")) {
			if (to.equals("Acres")) {
				value = HtoA(num);
			} else if (to.equals("Square Meter")) {
				value = HtoSM(num);
			} else {
				value = HtoSF(num);
			}
		} else if (from.equals("Acres")) {
			if (to.equals("Hectares")) {
				value = AtoH(num);
			} else if (to.equals("Square Meter")) {
				value = AtoSM(num);
			} else {
				value = AtoSF(num);
			}
		} else if (from.equals("Square Meter")) {
			if (to.equals("Hectares")) {
				value = SMtoH(num);
			} else if (to.equals("Acres")) {
				value = SMtoA(num);
			} else {
				value = SMtoSF(num);
			}
		} else if (from.equals("Square Feet")) {
			if (to.equals("Hectares")) {
				value = SFtoH(num);
			} else if (to.equals("Acres")) {
				value = SFtoA(num);
			} else {
				value = SFtoSM(num);
			}
		} else if (from.equals("Day")) {
			if (to.equals("Hour")) {
				value = DtoHO(num);
			} else if (to.equals("Minute")) {
				value = DtoMI(num);
			} else {
				value = DtoSE(num);
			}
		} else if (from.equals("Hour")) {
			if (to.equals("Day")) {
				value = HOtoD(num);
			} else if (to.equals("Minute")) {
				value = HOtoMI(num);
			} else {
				value = HOtoSE(num);
			}
		} else if (from.equals("Minute")) {
			if (to.equals("Day")) {
				value = MItoD(num);
			} else if (to.equals("Hour")) {
				value = MItoHO(num);
			} else {
				value = MItoSE(num);
			}
		} else if (from.equals("Second")) {
			if (to.equals("Day")) {
				value = SEtoD(num);
			} else if (to.equals("Hour")) {

				value = SEtoHO(num);

			} else {
				value = SEtoMI(num);
			}
		} else if (from.equals("Byte")) {
			if (to.equals("Kilobyte")) {
				value = BtoKB(num);
			} else if (to.equals("Megabyte")) {
				value = BtoMB(num);
			} else {
				value = BtoGB(num);
			}
		} else if (from.equals("Kilobyte")) {
			if (to.equals("Byte")) {
				value = KBtoB(num);
			} else if (to.equals("Megabyte")) {
				value = KBtoMB(num);
			} else {
				value = KBtoGB(num);
			}
		} else if (from.equals("Megabyte")) {
			if (to.equals("Byte")) {
				value = MBtoB(num);
			} else if (to.equals("Kilobyte")) {
				value = MBtoKB(num);
			} else {
				value = MBtoGB(num);
			}
		} else if (from.equals("Gigabyte")) {
			if (to.equals("Byte")) {
				value = GBtoB(num);
			} else if (to.equals("Kilobyte")) {

				value = GBtoKB(num);

			} else {
				value = GBtoMB(num);
			}
		} else if (from.equals("gm/m3")) {
			if (to.equals("gm/cm3")) {
				value = m3tocm3(num);
			} else if (to.equals("kg/m3")) {
				value = m3tokg(num);
			} else {
				value = m3tokgc(num);
			}
		} else if (from.equals("gm/cm3")) {
			if (to.equals("gm/m3")) {
				value = cm3tom3(num);
			} else if (to.equals("kg/m3")) {
				value = cm3tokg(num);
			} else {
				value = cm3tokgc(num);
			}
		} else if (from.equals("kg/m3")) {
			if (to.equals("gm/m3")) {
				value = kgtom3(num);
			} else if (to.equals("gm/cm3")) {
				value = kgtocm3(num);
			} else {
				value = kgtokgc(num);
			}
		} else if (from.equals("kg/cm3")) {
			if (to.equals("gm/m3")) {
				value = kgctom3(num);
			} else if (to.equals("gm/cm3")) {

				value = kgctocm3(num);

			} else {
				value = kgctokg(num);
			}
		} else if (from.equals("Watt")) {
			if (to.equals("Kilowatt")) {
				value = WatoKw(num);
			} else if (to.equals("Megawatt")) {
				value = WatoMw(num);
			} else {
				value = WatoHp(num);
			}
		} else if (from.equals("Kilowatt")) {
			if (to.equals("Watt")) {
				value = KwtoWa(num);
			} else if (to.equals("Megawatt")) {
				value = KwtoMw(num);
			} else {
				value = KwtoHp(num);
			}
		} else if (from.equals("Megawatt")) {
			if (to.equals("Watt")) {
				value = MwtoWa(num);
			} else if (to.equals("Kilowatt")) {
				value = MwtoKw(num);
			} else {
				value = MwtoHp(num);
			}
		} else if (from.equals("Horsepower")) {
			if (to.equals("Watt")) {
				value = HptoWa(num);
			} else if (to.equals("Kilowatt")) {

				value = HptoKw(num);

			} else {
				value = HptoMw(num);
			}

		} else if (from.equals("Newton")) {
			if (to.equals("Kilonewton")) {
				value = NetoKi(num);
			} else {
				value = NetoDn(num);
			}
		} else if (from.equals("Kilonewton")) {
			if (to.equals("Newton")) {
				value = KitoNe(num);
			} else {
				value = KitoDn(num);
			}
		} else if (from.equals("Dyne")) {
			if (to.equals("Newton")) {
				value = DntoNe(num);
			} else {
				value = DntoKi(num);
			}
		} else if (from.equals("Cubic Meter")) {
			if (to.equals("Cubic Centimeter")) {
				value = MetoCm(num);
			} else if (to.equals("Cubic Yard")) {
				value = MetoYd(num);
			} else {
				value = MetoLt(num);
			}
		} else if (from.equals("Cubic Centimeter")) {
			if (to.equals("Cubic Meter")) {
				value = CmtoMe(num);
			} else if (to.equals("Cubic Yard")) {
				value = CmtoYd(num);
			} else {
				value = CmtoLt(num);
			}
		} else if (from.equals("Cubic Yard")) {
			if (to.equals("Cubic Meter")) {
				value = YdtoMe(num);
			} else if (to.equals("Cubic Centimeter")) {
				value = YdtoCm(num);
			} else {
				value = YdtoLt(num);
			}
		} else if (from.equals("Liter")) {
			if (to.equals("Cubic Meter")) {
				value = LttoMe(num);
			} else if (to.equals("Cubic Centimeter")) {

				value = LttoCm(num);

			} else {
				value = LttoYd(num);
			}
		} else if (from.equals("Ampere")) {
			if (to.equals("Kiloampere")) {
				value = amtokm(num);
			} else if (to.equals("Miliampere")) {
				value = amtomm(num);
			} else {
				value = amtobt(num);
			}
		} else if (from.equals("Kiloampere")) {
			if (to.equals("Ampere")) {
				value = kmtoam(num);
			} else if (to.equals("Miliampere")) {
				value = kmtomm(num);
			} else {
				value = kmtobt(num);
			}
		} else if (from.equals("Miliampere")) {
			if (to.equals("Ampere")) {
				value = mmtoam(num);
			} else if (to.equals("Kiloampere")) {
				value = mmtokm(num);
			} else {
				value = mmtobt(num);
			}
		} else if (from.equals("Biot")) {
			if (to.equals("Ampere")) {
				value = bttoam(num);
			} else if (to.equals("Kiloampere")) {

				value = bttokm(num);

			} else {
				value = bttomm(num);
			}
		} else if (from.equals("km/hour")) {
			if (to.equals("km/sec")) {
				value = khtoks(num);
			} else if (to.equals("m/sec")) {
				value = khtoms(num);
			} else {
				value = khtomin(num);
			}
		} else if (from.equals("km/sec")) {
			if (to.equals("km/hour")) {
				value = kstokh(num);
			} else if (to.equals("m/sec")) {
				value = kstoms(num);
			} else {
				value = kstomin(num);
			}
		} else if (from.equals("m/sec")) {
			if (to.equals("km/hour")) {
				value = mstokh(num);
			} else if (to.equals("km/sec")) {
				value = mstoks(num);
			} else {
				value = mstomin(num);
			}
		} else if (from.equals("m/min")) {
			if (to.equals("km/hour")) {
				value = mintokh(num);
			} else if (to.equals("km/sec")) {

				value = mintoks(num);

			} else {
				value = mintoms(num);
			}
		} else if (from.equals("Calorie")) {
			if (to.equals("Joule")) {
				value = CatoJo(num);
			} else {
				value = JotoCa(num);
			}
		} else if (from.equals("Joule")) {
			if (to.equals("Calorie")) {
				value = JotoCa(num);
			} else {
				value = CatoJo(num);
			}
		}
		 else if (from.equals("atmosphere")) {
			if (to.equals("pascal")) {
				value = atmtopa(num);
			} else if (to.equals("torr")) {
				value = atmtot(num);
			} else {
				value = atmtob(num);
			}
		} else if (from.equals("pascal")) {
			if (to.equals("atmosphere")) {
				value = patoatm(num);
			} else if (to.equals("torr")) {
				value = patot(num);
			} else {
				value = patob(num);
			}
		} else if (from.equals("torr")) {
			if (to.equals("atmosphere")) {
				value = ttoatm(num);
			} else if (to.equals("pascal")) {
				value = ttopa(num);
			} else {
				value = ttob(num);
			}
		} else if (from.equals("bar")) {
			if (to.equals("atmosphere")) {
				value = btoatm(num);
			} else if (to.equals("pascal")) {

				value = btopa(num);

			} else {
				value = btot(num);
			}
		} else if (from.equals("Curie")) {
			if (to.equals("Becquerel")) {
				value = cutobq(num);
			} else {
				value = cutorf(num);
			}
		} else if (from.equals("Becquerel")) {
			if (to.equals("Curie")) {
				value = bqtocu(num);
			} else {
				value = bqtorf(num);
			}
		} else if (from.equals("Rutherford")) {
			if (to.equals("Curie")) {
				value = rftocu(num);
			} else {
				value = rftobq(num);
			}

		} else if (from.equals("hertz")) {
			if (to.equals("kilohertz")) {
				value = hztokh(num);
			} else {
				value = hztomh(num);
			}
		} else if (from.equals("kilohertz")) {
			if (to.equals("hertz")) {
				value = khtohz(num);
			} else {
				value = khtomh(num);
			}
		} else if (from.equals("megahertz")) {
			if (to.equals("hertz")) {
				value = mhtohz(num);
			} else {
				value = mhtokh(num);
			}

		} else if (from.equals("lumen/square centimeter")) {
			if (to.equals("lumen/square meter ")) {
				value = sctosm(num);
			} else {
				value = sctolx(num);
			}
		} else if (from.equals("lumen/square meter")) {
			if (to.equals("lumen/square centimeter")) {
				value = smtosc(num);
			} else {
				value = smtolx(num);
			}
		} else if (from.equals("lux")) {
			if (to.equals("lumen/square centimeter")) {
				value = lxtosc(num);
			} else {
				value = lxtosm(num);
			}

		} else if (from.equals("Henry")) {
			if (to.equals("Microhenry")) {
				value = hntomh(num);
			} else {
				value = hntomih(num);
			}
		} else if (from.equals("Microhenry")) {
			if (to.equals("Henry")) {
				value = mhtohn(num);
			} else {
				value = mhtomih(num);
			}
		} else if (from.equals("Millihenry")) {
			if (to.equals("Henry")) {
				value = mihtohn(num);
			} else {
				value = mihtomh(num);
			}

		} 

		else if (from.equals("US Dollar")) {
			if (to.equals("British Pound")) {
				value = ustouk(num);
			} else if (to.equals("Bangladesh Taka")) {
				value = ustobd(num);
			} else {
				value = ustoin(num);
			}
		} else if (from.equals("British Pound")) {
			if (to.equals("US Dollar")) {
				value = uktous(num);
			} else if (to.equals("Bangladesh Taka")) {
				value = uktobd(num);
			} else {
				value = uktoin(num);
			}
		} else if (from.equals("Bangladesh Taka")) {
			if (to.equals("US Dollar")) {
				value = bdtous(num);
			} else if (to.equals("British Pound")) {

				value = bdtouk(num);

			} else {
				value = bdtoin(num);
			}
		} else if (from.equals("India Rupee")) {
			if (to.equals("US Dollar")) {
				value = intous(num);
			} else if (to.equals("British Pound")) {
				value = intouk(num);
			} else {
				value = intobd(num);
			}
		} else if (from.equals("bel")) {
			if (to.equals("decibel")) {
				value = btod(num);
			}
		

			else {
				value = dtob(num);
			}

	}else if (from.equals("decibel")) {
		if (to.equals("bel")) {
			value = dtob(num);
		}
	

		else {
			value = btod(num);
		}
	} else if (from.equals("g/mol")) {
		if (to.equals("kg/mol")) {
			value = GMtoKM(num);
		}
	

		else {
			value = KMtoGM(num);
		}

}else if (from.equals("kg/mol")) {
	if (to.equals("g/mol")) {
		value = KMtoGM(num);
	}


	else {
		value = GMtoKM(num);
	}
}
		

		String valueStr = Float.toString(value);// cast float to string
		input2.setText(valueStr);

		if (from.equals(to)) {

			input2.setText(entervalue);

		}

	}

	public float CelltoFar(float Cell) {
		// float f=Cell*9/5+32;
		return Cell * 9 / 5 + 32;
	}

	public float CelltoKel(float Cell) {
		// float k=(float) (Cell+273.15);
		return (float) (Cell + 273.15);

	}

	public float FartoCell(float Far) {
		return (Far - 32) * 5 / 9;

	}

	public float FartoKell(float Far) {
		return (float) (1 / 1.8 * (Far - 32) + 273.15);
	}

	public float KelltoCell(float Kell) {
		return (float) (Kell - 273.15);
	}

	public float KelltoFar(float Kell) {
		return (float) (1.8 * (Kell - 273.15) + 32);
	}

	public float DegtoRad(float Deg) {
		return (float) (Deg * 0.01745329);

	}

	public float RadtoDeg(float Rad) {
		return (float) (Rad * (1 / 0.01745329));
	}

	public float FtoI(float F) {
		return F * 12;
	}

	public float FtoC(float F) {
		return (float) (F * 30.48);
	}

	public float ItoF(float I) {
		return (float) (I * 0.08333333);
	}

	public float ItoC(float I) {
		return (float) (I * 2.54);
	}

	public float CtoF(float C) {
		return (float) (C * 0.0328084);
	}

	public float CtoI(float C) {
		return (float) (C * 0.39370079);

	}

	public float KtoG(float K) {
		return K * 1000;
	}

	public float KtoP(float K) {
		return (float) (K * 2.2046);
	}

	public float GtoK(float G) {
		return (float) (G * .001);
	}

	public float GtoP(float G) {
		return (float) (G * 0.0022046);
	}

	public float PtoK(float P) {
		return (float) (P * (1 / 2.2046));
	}

	public float PtoG(float P) {
		return (float) (P / 0.0022046);
	}

	public float HtoA(float H) {
		return (float) (H * 2.4711);
	}

	public float HtoSM(float H) {
		return H * 10000;
	}

	public float HtoSF(float H) {
		return (float) (H * 107639.104);
	}

	public float AtoH(float A) {
		return (float) (A * 0.404685);
	}

	public float AtoSM(float A) {
		return (float) (A * 4046.856);
	}

	public float AtoSF(float A) {
		return A * 43560;
	}

	public float SMtoH(float SM) {
		return (float) (SM * 0.0001);
	}

	public float SMtoA(float SM) {
		return (float) (SM * 0.000247);

	}

	public float SMtoSF(float SM) {
		return (float) (SM * 10.7639);

	}

	public float SFtoH(float SF) {

		return (float) (SF / 107639.104);
	}

	public float SFtoA(float SF) {
		return SF / 43560;
	}

	public float SFtoSM(float SF) {
		return (float) (SF * 0.0929);
	}

	public float DtoHO(float D) {
		return D * 24;
	}

	public float DtoMI(float D) {
		return D * 24 * 60;
	}

	public float DtoSE(float D) {
		return D * 24 * 60 * 60;
	}

	public float HOtoD(float HO) {
		return HO / 24;
	}

	public float HOtoMI(float HO) {
		return HO * 60;
	}

	public float HOtoSE(float HO) {
		return HO * 60 * 60;
	}

	public float MItoD(float MI) {
		return (float) (MI * 0.000694444444);
	}

	public float MItoHO(float MI) {
		return (float) (MI * 0.0166666667);
	}

	public float MItoSE(float MI) {
		return MI * 60;
	}

	public float SEtoD(float SE) {
		return (float) (SE * .000011574);
	}

	public float SEtoHO(float SE) {
		return (float) (SE * 0.000277777778);
	}

	public float SEtoMI(float SE) {
		return (float) (SE * 0.0166666667);
	}

	public float BtoKB(float B) {
		return (float) (B * 0.0009765625);
	}

	public float BtoMB(float B) {
		return (float) (B * 0.000000953674316);
	}

	public float BtoGB(float B) {
		return (float) (B * 0.0000000009313225);
	}

	public float KBtoB(float KB) {
		return KB * 1024;
	}

	public float KBtoMB(float KB) {
		return (float) (KB * 0.0009765625);

	}

	public float KBtoGB(float KB) {
		return (float) (KB * 0.000000953674316);
	}

	public float MBtoB(float MB) {
		return MB * 1048576;
	}

	public float MBtoKB(float MB) {
		return MB * 1024;
	}

	public float MBtoGB(float MB) {
		return (float) (MB * 0.0009765625);
	}

	public float GBtoB(float GB) {
		return GB * 1073741824;
	}

	public float GBtoKB(float GB) {
		return GB * 1048576;
	}

	public float GBtoMB(float GB) {
		return GB * 1024;
	}

	public float m3tocm3(float m3) {
		return (float) (m3 * .000001);
	}

	public float m3tokg(float m3) {
		return (float) (m3 * 0.001);

	}

	public float m3tokgc(float m3) {
		return (float) (m3 * .000000001);
	}

	public float cm3tom3(float cm3) {
		return cm3 * 1000000;
	}

	public float cm3tokg(float cm3) {
		return cm3 * 1000;
	}

	public float cm3tokgc(float cm3) {
		return (float) (cm3 * 0.001);
	}

	public float kgtom3(float kg) {
		return kg * 1000;
	}

	public float kgtocm3(float kg) {
		return (float) (kg * 0.001);
	}

	public float kgtokgc(float kg) {
		return (float) (kg * 0.000001);
	}

	public float kgctom3(float kgc) {
		return kgc * 1000000000;
	}

	public float kgctocm3(float kgc) {
		return kgc * 1000;
	}

	public float kgctokg(float kgc) {
		return kgc * 1000000;
	}

	public float WatoKw(float Wa) {
		return (float) (Wa * 0.001);
	}

	public float WatoMw(float Wa) {
		return (float) (Wa * .000001);
	}

	public float WatoHp(float Wa) {
		return (float) (Wa * 0.00134102209);
	}

	public float KwtoWa(float Kw) {
		return Kw * 1000;
	}

	public float KwtoMw(float Kw) {
		return (float) (Kw * 0.001);
	}

	public float KwtoHp(float Kw) {
		return (float) (Kw * 1.34102209);
	}

	public float MwtoWa(float Mw) {
		return Mw * 1000000;
	}

	public float MwtoKw(float Mw) {
		return Mw * 1000;
	}

	public float MwtoHp(float Mw) {
		return (float) (Mw * 1341.02209);
	}

	public float HptoWa(float Hp) {
		return (float) (Hp * 745.699872);
	}

	public float HptoKw(float Hp) {
		return (float) (Hp * 0.745699872);
	}

	public float HptoMw(float Hp) {
		return (float) (Hp * 0.000745699872);
	}

	public float NetoKi(float Ne) {
		return (float) (Ne * 0.001);
	}

	public float NetoDn(float Ne) {
		return Ne * 100000;
	}

	public float KitoNe(float Ki) {
		return Ki * 1000;
	}

	public float KitoDn(float Ki) {
		return Ki * 100000000;
	}

	public float DntoNe(float Dn) {
		return (float) (Dn * .00001);
	}

	public float DntoKi(float Dn) {
		return (float) (Dn * .00000001);
	}

	public float MetoCm(float Me) {
		return Me * 1000000;
	}

	public float MetoYd(float Me) {
		return (float) (Me * 1.30795062);
	}

	public float MetoLt(float Me) {
		return Me * 1000;
	}

	public float CmtoMe(float Cm) {
		return (float) (Cm * .000001);
	}

	public float CmtoYd(float Cm) {
		return (float) (Cm * .00000130795);
	}

	public float CmtoLt(float Cm) {
		return (float) (Cm * 0.001);
	}

	public float YdtoMe(float Yd) {
		return (float) (Yd * 0.764554858);
	}

	public float YdtoCm(float Yd) {
		return (float) (Yd * 764554.858);
	}

	public float YdtoLt(float Yd) {
		return (float) (Yd * 764.554858);
	}

	public float LttoMe(float Lt) {
		return (float) (Lt * 0.001);
	}

	public float LttoCm(float Lt) {
		return Lt * 1000;
	}

	public float LttoYd(float Lt) {
		return (float) (Lt * 0.00130795062);
	}

	public float amtokm(float am) {
		return (float) (am * 0.001);
	}

	public float amtomm(float am) {
		return am * 1000;
	}

	public float amtobt(float am) {
		return (float) (am * 0.1);
	}

	public float kmtoam(float km) {
		return km * 1000;
	}

	public float kmtomm(float km) {
		return km * 1000000;
	}

	public float kmtobt(float km) {
		return km * 100;
	}

	public float mmtoam(float mm) {
		return (float) (mm * 0.001);
	}

	public float mmtokm(float mm) {
		return (float) (mm * .000001);
	}

	public float mmtobt(float mm) {
		return (float) (mm * 0.0001);
	}

	public float bttoam(float bt) {
		return bt * 10;
	}

	public float bttokm(float bt) {
		return (float) (bt * 0.01);
	}

	public float bttomm(float bt) {
		return bt * 10000;
	}

	public float khtoks(float kh) {
		return (float) (kh * 0.000277777778);
	}

	public float khtoms(float kh) {
		return (float) (kh * 0.277777778);
	}

	public float khtomin(float kh) {
		return (float) (kh * 16.6666667);
	}

	public float kstokh(float ks) {
		return ks * 3600;
	}

	public float kstoms(float ks) {
		return ks * 1000;
	}

	public float kstomin(float ks) {
		return ks * 60000;
	}

	public float mstokh(float ms) {
		return (float) (ms * 3.6);
	}

	public float mstoks(float ms) {
		return (float) (ms * 0.001);
	}

	public float mstomin(float ms) {
		return ms * 60;
	}

	public float mintokh(float min) {
		return (float) (min * 0.06);
	}

	public float mintoks(float min) {
		return (float) (min * .0000167);
	}

	public float mintoms(float min) {
		return (float) (min * 0.0166666667);
	}

	public float CatoJo(float Ca) {
		return (float) (Ca * 4.18400);
	}

	

	public float JotoCa(float Jo) {
		return (float) (Jo * 0.239005736);
	}

	

	public float atmtopa(float atm) {
		return atm * 101325;
	}

	public float atmtot(float atm) {
		return atm * 760;
	}

	public float atmtob(float atm) {
		return (float) (atm * 1.01325);
	}

	public float patoatm(float pa) {
		return (float) (pa * .00000986);
	}

	public float patob(float pa) {
		return (float) (pa * .00001);
	}

	public float patot(float pa) {
		return (float) (pa * 0.00750061683);
	}

	public float ttoatm(float t) {
		return (float) (t * 0.00131578947);
	}

	public float ttopa(float t) {
		return (float) (t * 133.322368);
	}

	public float ttob(float t) {
		return (float) (t * 0.00133322368);
	}

	public float btoatm(float b) {
		return (float) (b * 0.986923267);
	}

	public float btopa(float b) {
		return b * 100000;
	}

	public float btot(float b) {
		return (float) (b * 750.061683);
	}

	public float cutobq(float cu) {
		return (float) (cu * (1 / 0.000000000027027027027027));
	}

	public float cutorf(float cu) {
		return cu * 37000;
	}

	public float bqtocu(float bq) {
		return (float) (bq * 0.000000000027);
	}

	public float bqtorf(float bq) {
		return (float) (bq * .000001);
	}

	public float rftocu(float rf) {
		return (float) (rf * .000027);
	}

	public float rftobq(float rf) {
		return rf * 1000000;
	}

	public float hztokh(float hz) {
		return (float) (hz * 0.001);
	}

	public float hztomh(float hz) {
		return (float) (hz * .000001);
	}

	public float khtohz(float kh) {
		return kh * 1000;
	}

	public float khtomh(float kh) {
		return (float) (kh * 0.001);
	}

	public float mhtohz(float mh) {
		return mh * 1000000;
	}

	public float mhtokh(float mh) {
		return mh * 1000;
	}

	public float sctosm(float sc) {
		return sc * 10000;
	}

	public float sctolx(float sc) {
		return sc * 10000;
	}

	public float smtosc(float sm) {
		return (float) (sm * 0.0001);
	}

	public float smtolx(float sm) {
		return sm * 1;
	}

	public float lxtosm(float lx) {
		return lx * 1;
	}

	public float lxtosc(float lx) {
		return (float) (lx * 0.0001);
	}

	public float hntomh(float hn) {
		return hn * 1000000;
	}

	public float hntomih(float hn) {
		return hn * 1000;
	}

	public float mhtohn(float mh) {
		return (float) (mh * .000001);
	}

	public float mhtomih(float mh) {
		return (float) (mh * 0.001);
	}

	public float mihtohn(float mih) {
		return (float) (mih * 0.001);
	}

	public float mihtomh(float mih) {
		return mih * 1000;
	}

	

	public float ustouk(float us) {
		return (float) (us * 0.6013);
	}

	public float ustobd(float us) {
		return (float) (us * 77.31);
	}

	public float ustoin(float us) {
		return (float) (us * 62.29);
	}

	public float uktous(float uk) {
		return (float) (uk * 1.64984);
	}

	public float uktobd(float uk) {
		return (float) (uk * 126.118);
	}

	public float uktoin(float uk) {
		return (float) (uk * 101.976);
	}

	public float bdtous(float bd) {
		return (float) (bd * 0.01264);
	}

	public float bdtouk(float bd) {
		return (float) (bd * 0.00766);
	}

	public float bdtoin(float bd) {
		return (float) (bd * 0.78155);
	}

	public float intous(float in) {
		return (float) (in * 0.01614);
	}

	public float intouk(float in) {
		return (float) (in * 0.00978);
	}

	public float intobd(float in) {
		return (float) (in * 1.23391);
	}
	public float btod(float b) {
		return b*10;
	}

	public float dtob(float d) {
		return (float) ( d*.1);
	}
	public float GMtoKM(float GM){
		return (float)(GM*0.001);
	}
	public float KMtoGM(float KM){
		return KM*1000;
	}

}
