# Brute Force Selection Sort
:+1: Simplest form of sorting by interating through the list multiple times until all the elements in the list are sorted.

# Psuedocode

:+1: <br />
 $\textcolor{olive}{Function\ sort\ (IntArray)}$ <br />
 $\textcolor{violet}{for\ i\ in\ 0\ to\ n-1}$ <br />
 $\textcolor{olive}{minValue\ =\ IntArray\ [i]}$ <br />
 $\textcolor{olive}{minIndex\ =\ i}$ <br />
 $\textcolor{violet}{for\ j\ in\ i+1\ to\ n-1}$ <br />
 $\textcolor{olive}{if\ (IntArray[j]\ <\ minIndex)}$ <br />
 $\textcolor{olive}{minValue\ =\ IntArray\ [j]}$ <br />
 $\textcolor{olive}{minIndex\ =\ j}$ <br />
 $\textcolor{olive}{Swap\ IntArray\ [i]\ ,\ IntArray\ [minIndex]}$ <br />
 $\textcolor{olive}{return\ IntArray}$ <br />
 
 # Visualization
 
 
Unsorted list of integers

```mermaid
graph LR;
    9-->4;
    4-->7;
    7-->2;
    2-->6;
    6-->10;
    10-->20;
    20-->34;
    34-->1;
    1-->3;
```

Sorted list of integers after multiple scans

```mermaid
graph LR;
    1-->2;
    2-->3;
    3-->4;
    4-->6;
    6-->7;
    7-->9;
    9-->10;
    10-->20;
    20-->34;
```


# Analyzing the algorithm
Algorithm runs through a sequence of n-iterations and in the i<sup>th</sup> iteration, algorithm now looks at the part of index i onwards to locate the smallest index and put it into the sorted region.
# Efficiency
OS dependent, hardware dependent and variations in some languages can affect efficiency. Focus should  then be on system independent factors. Hence defining the size of the input would help in determining running time.
## Asymptotic Time Complexity


## Space

