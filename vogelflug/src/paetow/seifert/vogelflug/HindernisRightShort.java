package paetow.seifert.vogelflug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class HindernisRightShort extends HindernisAbstract{

	public HindernisRightShort(Bitmap bmp,GameView theGameView) {
		super(theGameView);
		this.bmp=bmp;
		this.xPos= 50;
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
			destine = new Rect(theGameView.getWidth()-width/3-xPos, theGameView.getHeight() - yPos, theGameView.getWidth() - xPos,
					theGameView.getHeight() + 4*height/5 - yPos);
			canvas.drawBitmap(bmp, source, destine, null);
			yPos +=ySpeed;
			if(yPos >= theGameView.getHeight()+100){
				draw = false;
				yPos = 0;
			}
		}
	}
	

}