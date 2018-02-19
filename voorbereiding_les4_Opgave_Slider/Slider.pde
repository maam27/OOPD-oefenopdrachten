class Slider{
  float breedte;
  float hoogte;
  float x;
  float y;
  int nPosities;
  int positie;
  
  public Slider(float breedte, float hoogte, float x, float y, int positions){
    this.breedte = breedte;
    this.hoogte = hoogte;
    this.x = x;
    this.y = y;
    this.nPosities = positions;
  }
    
  void bepaalSliderPositie() {
    float blokjeBreedte = this.breedte / this.nPosities;
    if (mouseX < this.x) {
     this.positie = 0;
    } else if (mouseX >= this.breedte + this.x) {
      this.positie = this.nPosities - 1;
    } else {
      this.positie = floor((mouseX  - this.x) / blokjeBreedte);
    } 
  }
  
  void tekenSlider() {   
    float blokjeBreedte = this.breedte / this.nPosities;
    
    noStroke();
    fill(255);
    rect(this.x, this.y, this.breedte, this.hoogte);
    
    fill(#2257F0);
    rect(this.x + this.positie * blokjeBreedte, this.y, blokjeBreedte, this.hoogte);  
  }
  

}