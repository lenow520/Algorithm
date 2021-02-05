Find out an efficient way to find whether there exists three collinear points in the given array of points.
* Note: array[][0] is the X-coordinate of a point, and array[][1] is its Y-coordinate.
* idea: 
  * *For one point*, calculate all the slopes to the other points in the array.(slope=0 if the X-coordinates of the two numbers are the same, slope=∞ if the Y-coordinates of the two numbers are the same).
  * Put the results into the array *slope* and sort the array using *quick sort*.
  * Check whether any two consecutive number(slope) in the array are the same. If there exists two points that has the same slope to *the particular point*, return true as the three points are collinear.
