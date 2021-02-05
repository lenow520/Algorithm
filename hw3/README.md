Find out an efficient way to find whether there exists three collinear points in the given array of points.
* Note: array[][0] is the X-coordinate of a point, and array[][1] is its Y-coordinate.
* idea: 
  * Calculate all the slopes of any two points in the array. (slope=0 if the X-coordinates of the two numbers are the same, slope=∞ if the Y-coordinates of the two numbers are the same)
  * Put them into the array *slope* and sort the array using *quick sort*
  * Check whether any two consecutive number(slope) in the array are the same.
