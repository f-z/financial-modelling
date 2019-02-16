clear 
insheet using "/Users/wenqianhuang/Dropbox/TA Investment 2017/TA3/TA3_stata.csv"



* for loop with regression results

foreach var of varlist stock1-stock6 {
reg `var' market
matrix coefs=e(b)
matrix a=coefs[1,1]
matrix b=coefs[1,2]
matrix alphas=nullmat(alphas),a
matrix betas=nullmat(betas),b
matrix r2=nullmat(r2), e(r2)
matrix s2=nullmat(s2), e(V)
}



* histogram of betas

mata: st_matrix("beta",st_matrix("betas")') 
svmat beta
hist beta1
