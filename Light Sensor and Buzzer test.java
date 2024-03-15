#define BUZZER 5

void setup() {
  // initialize serial communication at 9600 bits per second:

  pinMode (buzzer, OUTPUT);

  Serial.begin(9600);
}

void loop() {
  // reads the input on analog pin A0 (value between 0 and 1023)
  int analogValue = analogRead(A0);
  int analogValue = tone(D8);

  Serial.print("Analog reading: ");
  Serial.print(analogValue); // the raw analog reading

  // We'll have a few threshholds, qualitatively determined
  if (analogValue < 10) {
    Serial.println(" - Dark");
  }
    else if (analogValue < 200) {
    Serial.println(" - Dim");
  }
      else if (analogValue < 500) {
    Serial.println(" - Light");
    tone(BUZZER, 85); //Set the voltage to high and makes a noise
    delay(1000); //Waits for 1000 milliseconds
  }
        else if (analogValue < 800) {
    Serial.println(" - Bright");
    tone(BUZZER, 85); //Set the voltage to high and makes a noise
    delay(1000); //Waits for 1000 milliseconds
  }
        else {
    Serial.println(" - Very Bright");
    tone(BUZZER, 85); //Set the voltage to high and makes a noise
    delay(1000); //Waits for 1000 milliseconds
  }

  delay(500);
}