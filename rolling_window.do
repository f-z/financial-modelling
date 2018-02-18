clear

insheet using "/Users/wenqianhuang/Dropbox/TA Investment 2017/TA3/TA3_stata.csv"

encode date, gen(d)

tsset d

rolling _b , window(36) clear: regress stock1 market

twoway (line _b_market start)


