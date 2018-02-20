class Damsteen{
  int x;
  int y;
  color colour; 
  int diameter;
  boolean isGeselecteerd;
  
  public Damsteen(int x, int y, color colour, int diameter){
    this.x = x;
    this.y = y;
    this.colour = colour;
    this.diameter = diameter;
  }
  
  void teken(){
    if(this.isGeselecteerd){
      strokeWeight(3);
    }else{
      strokeWeight(1);
    }    
    stroke(150);
    fill(this.colour);
    ellipse(this.x,this.y,this.diameter,this.diameter);    
  }  
  
  String toString(){
    return "De positie van de damsteen is x: "+this.x+", y: "+this.y;
  }
}