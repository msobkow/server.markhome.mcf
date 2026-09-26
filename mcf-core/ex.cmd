1,$s:^mv IMCF\([a-zA-Z0-9]*\.java\) \(IYCF[a-zA-Z0-9]*\.java\)\(;if \[ \! -f IYCF[a-zA-Z0-9]*\.java then; mv IMCFCFLib[a-zA-Z0-9]*]\.java IYCF[a-zA-Z0-9]*\.java;fi;if \[ \! -f IYCF[a-zA-Z0-9]*\.java then; mv IMCFLib[a-zA-Z0-9]*]\.java IYCF[a-zA-Z0-9]*\.java;fi;\):\1 \2;if [ ! -f \2 ] then; mv IMCFCFLib\1 \2; fi; if [ ! -f \2 ] then; mv IMCFLib\1 \2; fi:g
w $MCF_HOME/rename.files
q

