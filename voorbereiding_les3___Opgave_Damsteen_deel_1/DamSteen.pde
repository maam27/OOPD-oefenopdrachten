class DamSteen{
  int x;
  int y;
  color colour; 
  int diameter;
  
  public DamSteen(int x, int y, color colour, int diameter){
    this.x = x;
    this.y = y;
    this.colour = colour;
    this.diameter = diameter;
  }
  
  void teken(){
    stroke(150);
    fill(this.colour);
    ellipse(this.x,this.y,this.diameter,this.diameter);    
  }  
}