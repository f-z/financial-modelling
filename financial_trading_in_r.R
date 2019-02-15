install.packages("remotes")
remotes::install_ygithub("braverock/quantstrat")

# From quantmod library
# Get SPY from yahoo
getSymbols("SPY", 
           from = "2000-01-01", 
           to = "2016-06-30", 
           src =  "yahoo", 
           adjust =  TRUE)

# Plot the closing prices of SPY
plot(Cl(SPY))

# Add a 200-day SMA using lines()
lines(SMA(Cl(SPY), n = 200), col = "red")

# Load the quantstrat package
library(quantstrat)

# Create initdate, from, and to strings
initdate <- "1999-01-01"
from <- "2003-01-01"
to <- "2015-12-31"

# Set the timezone to UTC
Sys.setenv(TZ = "UTC")

# Set the currency to USD 
currency("USD")
