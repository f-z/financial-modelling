#!/bin/python3
import matplotlib.pyplot as plt
import numpy as np

#
# Start, end and duration of maximum draw-down
#
n = 1000
xs = np.random.randn(n).cumsum()
i = np.argmax(np.maximum.accumulate(xs) - xs) # end of the period
j = np.argmax(xs[:i]) # start of period

fig = plt.figure()
plt.plot(xs)
plt.plot([i, j], [xs[i], xs[j]], 'o', color='Red', markersize=10)
plt.show()
