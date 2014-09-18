package paetow.seifert.vogelflug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class HindernisLeftLong extends HindernisAbstract{

	public HindernisLeftLong(Bitmap bmp, GameView theGameView) {
		super(theGameView);
		this.bmp=bmp;
		this.xPos= 30;
		this.yPos= 0;
		this.xSpeed = 0;
		this.ySpeed = 10;
		this.width = bmp.getWidth();
		this.height = bmp.getHeight();
		this.draw = false;
	}
	public void setdraw(){
		draw=true;
	}
	
	public void onDraw(Canvas canvas){
		if(draw == true){
			source = new Rect(0, 0, height, width);
			destine = new Rect(xPos, theGameView.getHeight() - yPos, 2*width/5+xPos,
					theGameView.getHeight() + 3*height/4 - yPos);
			canvas.drawBitmap(bmp, source, destine, null);
			yPos += ySpeed;
			if(yPos >= theGameView.getHeight()+100){
				draw = false;
				yPos = 0;
			}
		}
		
	}
	

}