class Slider{
  float breedte;
  float hoogte;
  float x;
  float y;
  int nPosities;
  
  public Slider(float breedte, float hoogte, float x, float y, int positions){
    this.breedte = breedte;
    this.hoogte = hoogte;
    this.x = x;
    this.y = y;
    this.nPosities = positions;
  }
    
  int bepaalSliderPositie() {
    float blokjeBreedte = this.breedte / this.nPosities;
    
    if (mouseX < this.x) {
     return 0;
    }
    else if (mouseX >= this.breedte + this.x) {
      return this.nPosities - 1;
    }
    else {
      return floor((mouseX  - this.x) / blokjeBreedte);
    } 
  }
  
  void tekenSlider(int positie) {   
    float blokjeBreedte = this.breedte / this.nPosities;
    
    noStroke();
    fill(255);
    rect(this.x, this.y, this.breedte, this.hoogte);
    
    fill(#2257F0);
    rect(this.x + positie * blokjeBreedte, y, blokjeBreedte, hoogte);  
  }
  

}