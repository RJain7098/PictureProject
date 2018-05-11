------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

Rishabh Jain
Collage Project


Methods Used:

EDGE DETECTION: For each pixel, gets the difference between the average color of it and its neighbor. Compares this value
to a threshold, if it's under the threshold sets color to black. (So it detected the edge because the color was the same.)
Turns the edges to black and everything else to white. 

SOLARIZE: Negation (reverses the color), except it does not negate the color of every pixel - only pixels whose average 
color value is under a certain threshold. 

GLASS FILTER: Makes the picture look like it's through a glass. For each pixel, choose a random pixel a set distance away
and set the color of the pixel to the random one's color. 

RECURSIVE: Create a new picture that is half the size of the original. Call the method with the picture that is smaller. 
As the calls unstack, copy the smaller picture onto the picture that is the size before it. 

VERTICAL FLIP: Takes a pixel and sets the pixel opposite that pixel (across the horizontal line) to the same color as
the pixel. 

