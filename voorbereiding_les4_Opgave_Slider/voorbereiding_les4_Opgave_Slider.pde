Slider s1;

void setup() {
  size(300, 200);
  background(0);
  s1 = new Slider(200,50,(width-200)/2,50,5);
}


void draw() {
  s1.bepaalSliderPositie();
  s1.tekenSlider();  
}