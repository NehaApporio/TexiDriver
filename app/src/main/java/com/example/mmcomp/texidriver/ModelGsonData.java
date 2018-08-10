package com.example.mmcomp.texidriver;

import java.util.List;

public class ModelGsonData {

    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","place_id":"ChIJezVzMaTlDDkRP8B8yDDO_zc","types":["locality","political"]},{"geocoder_status":"OK","place_id":"ChIJCdTkl5oiDTkRoWnyThO04q4","types":["establishment","point_of_interest"]}]
     * routes : [{"bounds":{"northeast":{"lat":28.5870716,"lng":77.39104809999999},"southwest":{"lat":28.412646,"lng":77.03401699999999}},"copyrights":"Map data ©2018 Google","legs":[{"distance":{"text":"53.9 km","value":53878},"duration":{"text":"1 hour 14 mins","value":4450},"end_address":"#245, Tower B2 Spaze i-Tech Park, Sohna Road, Sector 49, Gurugram, Haryana 122018, India","end_location":{"lat":28.412646,"lng":77.0430847},"start_address":"Noida, Uttar Pradesh, India","start_location":{"lat":28.5355044,"lng":77.39104809999999},"steps":[{"distance":{"text":"1.7 km","value":1747},"duration":{"text":"4 mins","value":213},"end_location":{"lat":28.523625,"lng":77.37975449999999},"html_instructions":"Head <b>south-west<\/b> on <b>Vishwakarma Rd<\/b>","polyline":{"points":"{idmDamjwMn@zBfBjGFNDJHHFF`BxADD|FpEVTdBpAl@f@fBpAjLbJpBxA`Ax@NN|BbBlFbExDvCbDdCzEzD"},"start_location":{"lat":28.5355044,"lng":77.39104809999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":110},"duration":{"text":"1 min","value":17},"end_location":{"lat":28.5241849,"lng":77.3788314},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"s_bmDmfhwMKRcBbD"},"start_location":{"lat":28.523625,"lng":77.37975449999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":560},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5231975,"lng":77.3736948},"html_instructions":"Turn <b>left<\/b> at the 1st cross street","maneuver":"turn-left","polyline":{"points":"ccbmDu`hwM@\\@N?`@Cj@Y~AU~@[jAE\\CF?V?d@B`@Hj@DXHTN`@RZh@l@|@`Ad@t@LZLZL`@H^FZB`@H\\"},"start_location":{"lat":28.5241849,"lng":77.3788314},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":119},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.522495,"lng":77.3744294},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_}amDq`gwMV@D?D?F?B?DABADADEFIDEHQDG@EHWZaA"},"start_location":{"lat":28.5231975,"lng":77.3736948},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":100},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.5217113,"lng":77.37393949999999},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"sxamDeegwMRJ~A~@h@T"},"start_location":{"lat":28.522495,"lng":77.3744294},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":637},"duration":{"text":"1 min","value":57},"end_location":{"lat":28.525057,"lng":77.3687393},"html_instructions":"Turn <b>right<\/b>  onto the slip road","polyline":{"points":"usamDcbgwMWn@Uf@Wd@OZKNMPMNC@[La@fAm@vA{@lBO\\IPs@lAa@l@gA|AeApAmA`BU^GRIr@"},"start_location":{"lat":28.5217113,"lng":77.37393949999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":172},"duration":{"text":"1 min","value":22},"end_location":{"lat":28.5259341,"lng":77.367346},"html_instructions":"Keep <b>left<\/b> to continue towards <b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-left","polyline":{"points":"shbmDsafwM@HCXIZO\\_@h@m@|@_@j@OPEFMH"},"start_location":{"lat":28.525057,"lng":77.3687393},"travel_mode":"DRIVING"},{"distance":{"text":"31 m","value":31},"duration":{"text":"1 min","value":5},"end_location":{"lat":28.526117,"lng":77.36758139999999},"html_instructions":"Turn <b>right<\/b> towards <b>Noida-Greater Noida Expy<\/b>","maneuver":"turn-right","polyline":{"points":"anbmD}xewMe@m@"},"start_location":{"lat":28.5259341,"lng":77.367346},"travel_mode":"DRIVING"},{"distance":{"text":"5.8 km","value":5750},"duration":{"text":"5 mins","value":326},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Turn <b>left<\/b> to merge onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"gobmDkzewMCAE?G@KBGDEBOPEDEB_@l@s@tAw@~A}@xB_BtD}@rBcA|BkBtD_BzC[l@[n@mAvBw@vAq@`AcFpHkAjBw@rAmBfDkApB}AjCcCpEOVMVgAlBy@rAcAbBgBtCsA`CkBnDy@|A{@vAeApBgAtBkA|BiAtBwB|DgC|Es@rAaAfByApCkBjDmA`CiC~EkCdFqAxBq@jAqAnBgBhCiBdCSVyCnDyCfDsDbEyEdFk@n@kCxCoEvEe@j@o@t@sAbBgClD{DzFu@`Am@x@_@d@k@p@WVYZwCnDy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.526117,"lng":77.36758139999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":92},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSL_CvAoCdB[R]VwAz@_@RMJGDA?CBIFIDe@\\MFkJnGkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit towards <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit towards <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b>  onto the slip road to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue towards <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1820},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5727074,"lng":77.2093641},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZt@lAVd@Xd@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Lj@H~@BdAFlE@~A@t@@`@FfAHvGDr@BVFRBFDFDDFBLB"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":293},"duration":{"text":"1 min","value":28},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"mrkmDo}fvM^@t@HXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5727074,"lng":77.2093641},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the slip road onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Go past the petrol station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":317},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5780024,"lng":77.17615409999999},"html_instructions":"Take the exit towards <b>Rao Tularam Marg<\/b>","maneuver":"ramp-left","polyline":{"points":"_dlmDyw`vMKPEDQL}@h@aAf@sAn@kAj@sBbAGD_@ROH"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1494},"duration":{"text":"4 mins","value":221},"end_location":{"lat":28.5724344,"lng":77.16255120000001},"html_instructions":"Turn <b>left<\/b> onto <b>Rao Tularam Marg<\/b><div style=\"font-size:0.9em\">Pass by Kendriya Vidyalaya (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"oslmD}m`vMS^KTITCXKVJXp@tBpArDhAzCrBvFFRv@~BtCrIrAtDDNhBlFVr@DLzDvKZ|@h@~AjBlFDJXz@"},"start_location":{"lat":28.5780024,"lng":77.17615409999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1754},"duration":{"text":"5 mins","value":295},"end_location":{"lat":28.5749652,"lng":77.1472837},"html_instructions":"Turn <b>right<\/b> to stay on <b>Rao Tularam Marg<\/b>","maneuver":"turn-right","polyline":{"points":"upkmD}x}uM`@jAHTFL@BBDHTIDKH{A|@g@ZWNq@`@QLWNeDrBc@X[TYRMJST_@^[`@QPKRKRa@`ACPEVKr@Gp@ARAX?X?`@@l@?N@J@RBRDTBJ?B?B?@?@AJn@~AHVRl@j@fB`AbDb@jA|ArH@P@T?Z?D?f@Gb@ADAFGr@OhAMn@M`AW~BY`DMjAe@dFSjA"},"start_location":{"lat":28.5724344,"lng":77.16255120000001},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1246},"duration":{"text":"1 min","value":84},"end_location":{"lat":28.571361,"lng":77.13584019999999},"html_instructions":"Take the slip road on the <b>right<\/b> onto <b>NH 48<\/b>","polyline":{"points":"q`lmDoyzuMIVEVOlAe@hEMvACf@Cj@?`@@`@B^B`@Jn@H^Tz@Xx@v@rBFN\\|@@J@HBd@Nj@@DJ^h@pBVz@X~@^jA|@`Cb@bAXl@Xl@NXzCzFp@lA\\j@jArB"},"start_location":{"lat":28.5749652,"lng":77.1472837},"travel_mode":"DRIVING"},{"distance":{"text":"3.8 km","value":3818},"duration":{"text":"4 mins","value":236},"end_location":{"lat":28.5430752,"lng":77.1185909},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"_jkmD_rxuMDNHNPZHHBBXZXZLJx@n@NHTLr@\\@?f@NXHh@J^Fb@Db@BdAFpHLH?H?|DLjBD`]z@tBHb@Br@HpAPx@NjATxCn@bEv@^H~A^bFlAnBh@tCt@xBp@RFZLv@`@t@b@RPXVRPb@d@`C~CfCnDrAhB|AvBvBvCbCfDdB~BtAjBtAhB\\b@Zd@t@dAf@r@Zf@`@p@Xh@^z@Zv@N^x@xBvB~FZp@R`@R`@T\\JPNPX\\XXVTZT\\Tb@V"},"start_location":{"lat":28.571361,"lng":77.13584019999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.6 km","value":4579},"duration":{"text":"5 mins","value":290},"end_location":{"lat":28.5105249,"lng":77.09385859999999},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-left","polyline":{"points":"gyemDefuuM^PPFh@T`A\\jMvEzH~Cv@d@^VZXNNNPNPRVPXT\\NZR^d@dAnP~`@bB`EzBrFd@hALXR`@`@v@X^Z^VX\\ZZVZTRNn@^bQlKvMdIhWlO`@T^TVL@@RLfAn@fAn@bC|Ad@V~ChBhE~BRLdAl@lAt@hAn@jDrBbD`Bv@d@zAz@ZRTLTJVHzA^j@Fd@B^BlADx@Av@ErAUj@Mx@UfAc@|@g@"},"start_location":{"lat":28.5430752,"lng":77.1185909},"travel_mode":"DRIVING"},{"distance":{"text":"9.1 km","value":9117},"duration":{"text":"9 mins","value":548},"end_location":{"lat":28.4476017,"lng":77.0379939},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"wm_mDskpuM`CaA`Ac@hAe@pD_Ab@GfB]VCb@Gj@Eb@?l@?^@l@Bj@Fr@LZHTFXJ`@L^PRJTJVPXNVP`@ZpDrCvDtCvAbA`Av@hBtAdA|@dDtCr@n@lDbDlDbDlFxEnAnAZVZXnDhDpDjDd@^b@\\lCnC@@~CvChHdHhAhAfNjMbFtEfE`EFDjF~ExArApAnAjAdApDjDzLnLdE`En@l@l@l@b@d@~ArBvBrC\\d@@@b@l@fB`CTX`C~CfFdHhJdMtAnBbB~Bh@n@bC`DPR`@l@JJtLlPh@p@j@r@TVVTLLNLNL\\V`@V^T`Aj@~@f@dAl@dAn@dAv@`Az@B@rCfCvBtB|LpLn@f@dJxIHHTTZ\\`QdP`A|@rIdIXVTPbNjMTVHJFF@@TVbSxQdD`D"},"start_location":{"lat":28.5105249,"lng":77.09385859999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":454},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.4454031,"lng":77.03435220000001},"html_instructions":"Take the exit towards <b>NH248A<\/b>","maneuver":"ramp-left","polyline":{"points":"odslDmneuM^JJBJBNDvCvCR^`@l@^t@h@jAHPTx@Pz@@FBJ@LBRHd@@L@L@L@N@L@L@L@L"},"start_location":{"lat":28.4476017,"lng":77.0379939},"travel_mode":"DRIVING"},{"distance":{"text":"3.7 km","value":3668},"duration":{"text":"8 mins","value":468},"end_location":{"lat":28.413301,"lng":77.0415783},"html_instructions":"Turn <b>left<\/b> at <b>Rajiv Chowk<\/b> onto <b>NH248A<\/b><div style=\"font-size:0.9em\">Pass by Shiv Mandir (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"wvrlDuwduMDFDFFDFDFFFBFDFBLFLBNBLBL?N?lACfH_@bCMT@f@HpBKPAb@CtJm@TCb@ETADAn@EzC]XEJADA`C]JAxBa@REZIzAa@bB_@NG?AjASdAOzBWJAh@EhCS`CS`AQ~@OPCFAt@Qp@O\\I^KbCi@|@OvA]b@Gb@Ix@MfEw@fDq@DAdAUpE{@j@MpB_@bB[|Cm@f@I~FoAPE`Cc@hCg@dAS~Cm@rAWzAY^G`ASFANGTGNEdB]dASvBc@r@MnFeAd@Kl@KtAWHC"},"start_location":{"lat":28.4454031,"lng":77.03435220000001},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":147},"duration":{"text":"1 min","value":78},"end_location":{"lat":28.413166,"lng":77.0430597},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Partial restricted-usage road<\/div>","maneuver":"turn-left","polyline":{"points":"cnllD{dfuMAS?CAu@@OFa@BWLiA@_@?e@"},"start_location":{"lat":28.413301,"lng":77.0415783},"travel_mode":"DRIVING"},{"distance":{"text":"58 m","value":58},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.412646,"lng":77.0430847},"html_instructions":"Turn <b>right<\/b><div style=\"font-size:0.9em\">Restricted-usage road<\/div><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-right","polyline":{"points":"imllDcnfuM^@fAE"},"start_location":{"lat":28.413166,"lng":77.0430597},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"{idmDamjwMdDbLxBpBpb@j\\tPnM~J`IoBvD?zBqAhG?fBh@|B`D`Er@xBJ|@H\\V@J?J?TK\\i@J]ZaARJhCtAm@vAaAbBQP[La@fAiBdEYn@cFjHcB`CQfA[|A}BdDSPi@o@a@Ja@^iE|ImI|QeFpJyKvPyPhZyHnMgHvMmTra@oMrV}H~L}B|CsHvIeQrRyJ|KgLdP}BjCqEvF}FhI{A`CgA~B[^_EtJKx@uBlEqAhBoAhAgCjAmCz@sCdBaHlEuBtA{XfRqHfFs@v@eA|@_@l@Od@UlCWzCo@nDiAnDaAhBqEnE{ElD}DvCcFpCuCdBaCrBqCvDoBvEa@~Am@vEGjE`@jGb@zBpEbOjOxe@tAnHXnECvD_@lF{@hEiApDeCrEoSfW{AbDo@lCUfEFxBLjAfArETn@d@ZpCfDn@d@\\Lp@?n@YZg@\\gAF}AQu@[a@e@Wk@Gy@P{A|@oAbBm@fBg@`FQlBc@nBs@vA_BrCoBrCYt@_@xAIj@Fx@tAbEXnAFlAZxJChH[dEo@vCy@pB}FtIkCrDoAhBcGtHcBvCg@bDBvCfAzGXhD[hEwAdHCn@B`Bd@hCp@pAjEzF`ArA~E`GxGlIrBxApEdBjBbAbA`Aj@bA~@lDJ`AR|PGvNa@hUMfDZfHj@|Br@hAhAdAdFfDpBpClOjWxE`J\\vALdCLdKP~IHjAVh@jBRtJz@nBHXE^UNaAMc@o@]_AJc@Xs@fAU|AB`AZfAv@rAp@\\h@T^b@V~@R~@OnDSzHa@|OEbHNfHhAnYFxLcBr\\c@fLa@nGu@hD]lAwBvEgCdEaDpD_CxAwGhDmI`F{GdDo@\\_@t@Mn@KVJXbChH|DrKhH|SlC~HxLl]Vl@yChBsJfG}AbBkAzB]nCChBRvCARxBlGdBnF~AdI@~AwA`LaB~OeAfIUlETrCzClJ`@vBzBxHtC`HzFnKlBnD`AdAlBrAvBv@pC\\jKT`j@xAbFn@hMfChQlE`FhBvB~A`K~M~LvP`KrNdB|D`FlMdAbBfBbBrBfArZjLbCfBdAtA~A~CtX~p@|ArClBlBf}@ri@fO|IbY|ObDhBrBh@pAJ~E@~Bc@`Cy@jIsDtIiB`DMlDZlBj@`Bz@`UxPt]l[vVvU~`@p_@tOzNra@t`@zOxSl^nf@vO~SjAhA|JdG~G|Fj]h\\ba@p_@li@lg@fAXjDvD`AbBr@|Af@tBJt@VhCTb@^Vr@RxB?jLm@|@J|O_AzHw@~Cc@dGsA~D}@vFo@lKiA`Cg@xMmCxy@cP`a@_IFWAy@ZsC@eAfBC"},"summary":"NH 48","warnings":[],"waypoint_order":[]}]
     * status : OK
     */

    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * place_id : ChIJezVzMaTlDDkRP8B8yDDO_zc
         * types : ["locality","political"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":28.5870716,"lng":77.39104809999999},"southwest":{"lat":28.412646,"lng":77.03401699999999}}
         * copyrights : Map data ©2018 Google
         * legs : [{"distance":{"text":"53.9 km","value":53878},"duration":{"text":"1 hour 14 mins","value":4450},"end_address":"#245, Tower B2 Spaze i-Tech Park, Sohna Road, Sector 49, Gurugram, Haryana 122018, India","end_location":{"lat":28.412646,"lng":77.0430847},"start_address":"Noida, Uttar Pradesh, India","start_location":{"lat":28.5355044,"lng":77.39104809999999},"steps":[{"distance":{"text":"1.7 km","value":1747},"duration":{"text":"4 mins","value":213},"end_location":{"lat":28.523625,"lng":77.37975449999999},"html_instructions":"Head <b>south-west<\/b> on <b>Vishwakarma Rd<\/b>","polyline":{"points":"{idmDamjwMn@zBfBjGFNDJHHFF`BxADD|FpEVTdBpAl@f@fBpAjLbJpBxA`Ax@NN|BbBlFbExDvCbDdCzEzD"},"start_location":{"lat":28.5355044,"lng":77.39104809999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":110},"duration":{"text":"1 min","value":17},"end_location":{"lat":28.5241849,"lng":77.3788314},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"s_bmDmfhwMKRcBbD"},"start_location":{"lat":28.523625,"lng":77.37975449999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":560},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5231975,"lng":77.3736948},"html_instructions":"Turn <b>left<\/b> at the 1st cross street","maneuver":"turn-left","polyline":{"points":"ccbmDu`hwM@\\@N?`@Cj@Y~AU~@[jAE\\CF?V?d@B`@Hj@DXHTN`@RZh@l@|@`Ad@t@LZLZL`@H^FZB`@H\\"},"start_location":{"lat":28.5241849,"lng":77.3788314},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":119},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.522495,"lng":77.3744294},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_}amDq`gwMV@D?D?F?B?DABADADEFIDEHQDG@EHWZaA"},"start_location":{"lat":28.5231975,"lng":77.3736948},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":100},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.5217113,"lng":77.37393949999999},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"sxamDeegwMRJ~A~@h@T"},"start_location":{"lat":28.522495,"lng":77.3744294},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":637},"duration":{"text":"1 min","value":57},"end_location":{"lat":28.525057,"lng":77.3687393},"html_instructions":"Turn <b>right<\/b>  onto the slip road","polyline":{"points":"usamDcbgwMWn@Uf@Wd@OZKNMPMNC@[La@fAm@vA{@lBO\\IPs@lAa@l@gA|AeApAmA`BU^GRIr@"},"start_location":{"lat":28.5217113,"lng":77.37393949999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":172},"duration":{"text":"1 min","value":22},"end_location":{"lat":28.5259341,"lng":77.367346},"html_instructions":"Keep <b>left<\/b> to continue towards <b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-left","polyline":{"points":"shbmDsafwM@HCXIZO\\_@h@m@|@_@j@OPEFMH"},"start_location":{"lat":28.525057,"lng":77.3687393},"travel_mode":"DRIVING"},{"distance":{"text":"31 m","value":31},"duration":{"text":"1 min","value":5},"end_location":{"lat":28.526117,"lng":77.36758139999999},"html_instructions":"Turn <b>right<\/b> towards <b>Noida-Greater Noida Expy<\/b>","maneuver":"turn-right","polyline":{"points":"anbmD}xewMe@m@"},"start_location":{"lat":28.5259341,"lng":77.367346},"travel_mode":"DRIVING"},{"distance":{"text":"5.8 km","value":5750},"duration":{"text":"5 mins","value":326},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Turn <b>left<\/b> to merge onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"gobmDkzewMCAE?G@KBGDEBOPEDEB_@l@s@tAw@~A}@xB_BtD}@rBcA|BkBtD_BzC[l@[n@mAvBw@vAq@`AcFpHkAjBw@rAmBfDkApB}AjCcCpEOVMVgAlBy@rAcAbBgBtCsA`CkBnDy@|A{@vAeApBgAtBkA|BiAtBwB|DgC|Es@rAaAfByApCkBjDmA`CiC~EkCdFqAxBq@jAqAnBgBhCiBdCSVyCnDyCfDsDbEyEdFk@n@kCxCoEvEe@j@o@t@sAbBgClD{DzFu@`Am@x@_@d@k@p@WVYZwCnDy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.526117,"lng":77.36758139999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":92},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSL_CvAoCdB[R]VwAz@_@RMJGDA?CBIFIDe@\\MFkJnGkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit towards <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit towards <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b>  onto the slip road to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue towards <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1820},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5727074,"lng":77.2093641},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZt@lAVd@Xd@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Lj@H~@BdAFlE@~A@t@@`@FfAHvGDr@BVFRBFDFDDFBLB"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":293},"duration":{"text":"1 min","value":28},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"mrkmDo}fvM^@t@HXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5727074,"lng":77.2093641},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the slip road onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Go past the petrol station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":317},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5780024,"lng":77.17615409999999},"html_instructions":"Take the exit towards <b>Rao Tularam Marg<\/b>","maneuver":"ramp-left","polyline":{"points":"_dlmDyw`vMKPEDQL}@h@aAf@sAn@kAj@sBbAGD_@ROH"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1494},"duration":{"text":"4 mins","value":221},"end_location":{"lat":28.5724344,"lng":77.16255120000001},"html_instructions":"Turn <b>left<\/b> onto <b>Rao Tularam Marg<\/b><div style=\"font-size:0.9em\">Pass by Kendriya Vidyalaya (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"oslmD}m`vMS^KTITCXKVJXp@tBpArDhAzCrBvFFRv@~BtCrIrAtDDNhBlFVr@DLzDvKZ|@h@~AjBlFDJXz@"},"start_location":{"lat":28.5780024,"lng":77.17615409999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1754},"duration":{"text":"5 mins","value":295},"end_location":{"lat":28.5749652,"lng":77.1472837},"html_instructions":"Turn <b>right<\/b> to stay on <b>Rao Tularam Marg<\/b>","maneuver":"turn-right","polyline":{"points":"upkmD}x}uM`@jAHTFL@BBDHTIDKH{A|@g@ZWNq@`@QLWNeDrBc@X[TYRMJST_@^[`@QPKRKRa@`ACPEVKr@Gp@ARAX?X?`@@l@?N@J@RBRDTBJ?B?B?@?@AJn@~AHVRl@j@fB`AbDb@jA|ArH@P@T?Z?D?f@Gb@ADAFGr@OhAMn@M`AW~BY`DMjAe@dFSjA"},"start_location":{"lat":28.5724344,"lng":77.16255120000001},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1246},"duration":{"text":"1 min","value":84},"end_location":{"lat":28.571361,"lng":77.13584019999999},"html_instructions":"Take the slip road on the <b>right<\/b> onto <b>NH 48<\/b>","polyline":{"points":"q`lmDoyzuMIVEVOlAe@hEMvACf@Cj@?`@@`@B^B`@Jn@H^Tz@Xx@v@rBFN\\|@@J@HBd@Nj@@DJ^h@pBVz@X~@^jA|@`Cb@bAXl@Xl@NXzCzFp@lA\\j@jArB"},"start_location":{"lat":28.5749652,"lng":77.1472837},"travel_mode":"DRIVING"},{"distance":{"text":"3.8 km","value":3818},"duration":{"text":"4 mins","value":236},"end_location":{"lat":28.5430752,"lng":77.1185909},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"_jkmD_rxuMDNHNPZHHBBXZXZLJx@n@NHTLr@\\@?f@NXHh@J^Fb@Db@BdAFpHLH?H?|DLjBD`]z@tBHb@Br@HpAPx@NjATxCn@bEv@^H~A^bFlAnBh@tCt@xBp@RFZLv@`@t@b@RPXVRPb@d@`C~CfCnDrAhB|AvBvBvCbCfDdB~BtAjBtAhB\\b@Zd@t@dAf@r@Zf@`@p@Xh@^z@Zv@N^x@xBvB~FZp@R`@R`@T\\JPNPX\\XXVTZT\\Tb@V"},"start_location":{"lat":28.571361,"lng":77.13584019999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.6 km","value":4579},"duration":{"text":"5 mins","value":290},"end_location":{"lat":28.5105249,"lng":77.09385859999999},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-left","polyline":{"points":"gyemDefuuM^PPFh@T`A\\jMvEzH~Cv@d@^VZXNNNPNPRVPXT\\NZR^d@dAnP~`@bB`EzBrFd@hALXR`@`@v@X^Z^VX\\ZZVZTRNn@^bQlKvMdIhWlO`@T^TVL@@RLfAn@fAn@bC|Ad@V~ChBhE~BRLdAl@lAt@hAn@jDrBbD`Bv@d@zAz@ZRTLTJVHzA^j@Fd@B^BlADx@Av@ErAUj@Mx@UfAc@|@g@"},"start_location":{"lat":28.5430752,"lng":77.1185909},"travel_mode":"DRIVING"},{"distance":{"text":"9.1 km","value":9117},"duration":{"text":"9 mins","value":548},"end_location":{"lat":28.4476017,"lng":77.0379939},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"wm_mDskpuM`CaA`Ac@hAe@pD_Ab@GfB]VCb@Gj@Eb@?l@?^@l@Bj@Fr@LZHTFXJ`@L^PRJTJVPXNVP`@ZpDrCvDtCvAbA`Av@hBtAdA|@dDtCr@n@lDbDlDbDlFxEnAnAZVZXnDhDpDjDd@^b@\\lCnC@@~CvChHdHhAhAfNjMbFtEfE`EFDjF~ExArApAnAjAdApDjDzLnLdE`En@l@l@l@b@d@~ArBvBrC\\d@@@b@l@fB`CTX`C~CfFdHhJdMtAnBbB~Bh@n@bC`DPR`@l@JJtLlPh@p@j@r@TVVTLLNLNL\\V`@V^T`Aj@~@f@dAl@dAn@dAv@`Az@B@rCfCvBtB|LpLn@f@dJxIHHTTZ\\`QdP`A|@rIdIXVTPbNjMTVHJFF@@TVbSxQdD`D"},"start_location":{"lat":28.5105249,"lng":77.09385859999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":454},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.4454031,"lng":77.03435220000001},"html_instructions":"Take the exit towards <b>NH248A<\/b>","maneuver":"ramp-left","polyline":{"points":"odslDmneuM^JJBJBNDvCvCR^`@l@^t@h@jAHPTx@Pz@@FBJ@LBRHd@@L@L@L@N@L@L@L@L"},"start_location":{"lat":28.4476017,"lng":77.0379939},"travel_mode":"DRIVING"},{"distance":{"text":"3.7 km","value":3668},"duration":{"text":"8 mins","value":468},"end_location":{"lat":28.413301,"lng":77.0415783},"html_instructions":"Turn <b>left<\/b> at <b>Rajiv Chowk<\/b> onto <b>NH248A<\/b><div style=\"font-size:0.9em\">Pass by Shiv Mandir (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"wvrlDuwduMDFDFFDFDFFFBFDFBLFLBNBLBL?N?lACfH_@bCMT@f@HpBKPAb@CtJm@TCb@ETADAn@EzC]XEJADA`C]JAxBa@REZIzAa@bB_@NG?AjASdAOzBWJAh@EhCS`CS`AQ~@OPCFAt@Qp@O\\I^KbCi@|@OvA]b@Gb@Ix@MfEw@fDq@DAdAUpE{@j@MpB_@bB[|Cm@f@I~FoAPE`Cc@hCg@dAS~Cm@rAWzAY^G`ASFANGTGNEdB]dASvBc@r@MnFeAd@Kl@KtAWHC"},"start_location":{"lat":28.4454031,"lng":77.03435220000001},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":147},"duration":{"text":"1 min","value":78},"end_location":{"lat":28.413166,"lng":77.0430597},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Partial restricted-usage road<\/div>","maneuver":"turn-left","polyline":{"points":"cnllD{dfuMAS?CAu@@OFa@BWLiA@_@?e@"},"start_location":{"lat":28.413301,"lng":77.0415783},"travel_mode":"DRIVING"},{"distance":{"text":"58 m","value":58},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.412646,"lng":77.0430847},"html_instructions":"Turn <b>right<\/b><div style=\"font-size:0.9em\">Restricted-usage road<\/div><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-right","polyline":{"points":"imllDcnfuM^@fAE"},"start_location":{"lat":28.413166,"lng":77.0430597},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"{idmDamjwMdDbLxBpBpb@j\\tPnM~J`IoBvD?zBqAhG?fBh@|B`D`Er@xBJ|@H\\V@J?J?TK\\i@J]ZaARJhCtAm@vAaAbBQP[La@fAiBdEYn@cFjHcB`CQfA[|A}BdDSPi@o@a@Ja@^iE|ImI|QeFpJyKvPyPhZyHnMgHvMmTra@oMrV}H~L}B|CsHvIeQrRyJ|KgLdP}BjCqEvF}FhI{A`CgA~B[^_EtJKx@uBlEqAhBoAhAgCjAmCz@sCdBaHlEuBtA{XfRqHfFs@v@eA|@_@l@Od@UlCWzCo@nDiAnDaAhBqEnE{ElD}DvCcFpCuCdBaCrBqCvDoBvEa@~Am@vEGjE`@jGb@zBpEbOjOxe@tAnHXnECvD_@lF{@hEiApDeCrEoSfW{AbDo@lCUfEFxBLjAfArETn@d@ZpCfDn@d@\\Lp@?n@YZg@\\gAF}AQu@[a@e@Wk@Gy@P{A|@oAbBm@fBg@`FQlBc@nBs@vA_BrCoBrCYt@_@xAIj@Fx@tAbEXnAFlAZxJChH[dEo@vCy@pB}FtIkCrDoAhBcGtHcBvCg@bDBvCfAzGXhD[hEwAdHCn@B`Bd@hCp@pAjEzF`ArA~E`GxGlIrBxApEdBjBbAbA`Aj@bA~@lDJ`AR|PGvNa@hUMfDZfHj@|Br@hAhAdAdFfDpBpClOjWxE`J\\vALdCLdKP~IHjAVh@jBRtJz@nBHXE^UNaAMc@o@]_AJc@Xs@fAU|AB`AZfAv@rAp@\\h@T^b@V~@R~@OnDSzHa@|OEbHNfHhAnYFxLcBr\\c@fLa@nGu@hD]lAwBvEgCdEaDpD_CxAwGhDmI`F{GdDo@\\_@t@Mn@KVJXbChH|DrKhH|SlC~HxLl]Vl@yChBsJfG}AbBkAzB]nCChBRvCARxBlGdBnF~AdI@~AwA`LaB~OeAfIUlETrCzClJ`@vBzBxHtC`HzFnKlBnD`AdAlBrAvBv@pC\\jKT`j@xAbFn@hMfChQlE`FhBvB~A`K~M~LvP`KrNdB|D`FlMdAbBfBbBrBfArZjLbCfBdAtA~A~CtX~p@|ArClBlBf}@ri@fO|IbY|ObDhBrBh@pAJ~E@~Bc@`Cy@jIsDtIiB`DMlDZlBj@`Bz@`UxPt]l[vVvU~`@p_@tOzNra@t`@zOxSl^nf@vO~SjAhA|JdG~G|Fj]h\\ba@p_@li@lg@fAXjDvD`AbBr@|Af@tBJt@VhCTb@^Vr@RxB?jLm@|@J|O_AzHw@~Cc@dGsA~D}@vFo@lKiA`Cg@xMmCxy@cP`a@_IFWAy@ZsC@eAfBC"}
         * summary : NH 48
         * warnings : []
         * waypoint_order : []
         */

        private BoundsBean bounds;
        private String copyrights;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<?> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<?> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<?> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":28.5870716,"lng":77.39104809999999}
             * southwest : {"lat":28.412646,"lng":77.03401699999999}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 28.5870716
                 * lng : 77.39104809999999
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 28.412646
                 * lng : 77.03401699999999
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            /**
             * points : {idmDamjwMdDbLxBpBpb@j\tPnM~J`IoBvD?zBqAhG?fBh@|B`D`Er@xBJ|@H\V@J?J?TK\i@J]ZaARJhCtAm@vAaAbBQP[La@fAiBdEYn@cFjHcB`CQfA[|A}BdDSPi@o@a@Ja@^iE|ImI|QeFpJyKvPyPhZyHnMgHvMmTra@oMrV}H~L}B|CsHvIeQrRyJ|KgLdP}BjCqEvF}FhI{A`CgA~B[^_EtJKx@uBlEqAhBoAhAgCjAmCz@sCdBaHlEuBtA{XfRqHfFs@v@eA|@_@l@Od@UlCWzCo@nDiAnDaAhBqEnE{ElD}DvCcFpCuCdBaCrBqCvDoBvEa@~Am@vEGjE`@jGb@zBpEbOjOxe@tAnHXnECvD_@lF{@hEiApDeCrEoSfW{AbDo@lCUfEFxBLjAfArETn@d@ZpCfDn@d@\Lp@?n@YZg@\gAF}AQu@[a@e@Wk@Gy@P{A|@oAbBm@fBg@`FQlBc@nBs@vA_BrCoBrCYt@_@xAIj@Fx@tAbEXnAFlAZxJChH[dEo@vCy@pB}FtIkCrDoAhBcGtHcBvCg@bDBvCfAzGXhD[hEwAdHCn@B`Bd@hCp@pAjEzF`ArA~E`GxGlIrBxApEdBjBbAbA`Aj@bA~@lDJ`AR|PGvNa@hUMfDZfHj@|Br@hAhAdAdFfDpBpClOjWxE`J\vALdCLdKP~IHjAVh@jBRtJz@nBHXE^UNaAMc@o@]_AJc@Xs@fAU|AB`AZfAv@rAp@\h@T^b@V~@R~@OnDSzHa@|OEbHNfHhAnYFxLcBr\c@fLa@nGu@hD]lAwBvEgCdEaDpD_CxAwGhDmI`F{GdDo@\_@t@Mn@KVJXbChH|DrKhH|SlC~HxLl]Vl@yChBsJfG}AbBkAzB]nCChBRvCARxBlGdBnF~AdI@~AwA`LaB~OeAfIUlETrCzClJ`@vBzBxHtC`HzFnKlBnD`AdAlBrAvBv@pC\jKT`j@xAbFn@hMfChQlE`FhBvB~A`K~M~LvP`KrNdB|D`FlMdAbBfBbBrBfArZjLbCfBdAtA~A~CtX~p@|ArClBlBf}@ri@fO|IbY|ObDhBrBh@pAJ~E@~Bc@`Cy@jIsDtIiB`DMlDZlBj@`Bz@`UxPt]l[vVvU~`@p_@tOzNra@t`@zOxSl^nf@vO~SjAhA|JdG~G|Fj]h\ba@p_@li@lg@fAXjDvD`AbBr@|Af@tBJt@VhCTb@^Vr@RxB?jLm@|@J|O_AzHw@~Cc@dGsA~D}@vFo@lKiA`Cg@xMmCxy@cP`a@_IFWAy@ZsC@eAfBC
             */

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * distance : {"text":"53.9 km","value":53878}
             * duration : {"text":"1 hour 14 mins","value":4450}
             * end_address : #245, Tower B2 Spaze i-Tech Park, Sohna Road, Sector 49, Gurugram, Haryana 122018, India
             * end_location : {"lat":28.412646,"lng":77.0430847}
             * start_address : Noida, Uttar Pradesh, India
             * start_location : {"lat":28.5355044,"lng":77.39104809999999}
             * steps : [{"distance":{"text":"1.7 km","value":1747},"duration":{"text":"4 mins","value":213},"end_location":{"lat":28.523625,"lng":77.37975449999999},"html_instructions":"Head <b>south-west<\/b> on <b>Vishwakarma Rd<\/b>","polyline":{"points":"{idmDamjwMn@zBfBjGFNDJHHFF`BxADD|FpEVTdBpAl@f@fBpAjLbJpBxA`Ax@NN|BbBlFbExDvCbDdCzEzD"},"start_location":{"lat":28.5355044,"lng":77.39104809999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":110},"duration":{"text":"1 min","value":17},"end_location":{"lat":28.5241849,"lng":77.3788314},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"s_bmDmfhwMKRcBbD"},"start_location":{"lat":28.523625,"lng":77.37975449999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":560},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5231975,"lng":77.3736948},"html_instructions":"Turn <b>left<\/b> at the 1st cross street","maneuver":"turn-left","polyline":{"points":"ccbmDu`hwM@\\@N?`@Cj@Y~AU~@[jAE\\CF?V?d@B`@Hj@DXHTN`@RZh@l@|@`Ad@t@LZLZL`@H^FZB`@H\\"},"start_location":{"lat":28.5241849,"lng":77.3788314},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":119},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.522495,"lng":77.3744294},"html_instructions":"Turn <b>left<\/b>","maneuver":"turn-left","polyline":{"points":"_}amDq`gwMV@D?D?F?B?DABADADEFIDEHQDG@EHWZaA"},"start_location":{"lat":28.5231975,"lng":77.3736948},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":100},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.5217113,"lng":77.37393949999999},"html_instructions":"Turn <b>right<\/b>","maneuver":"turn-right","polyline":{"points":"sxamDeegwMRJ~A~@h@T"},"start_location":{"lat":28.522495,"lng":77.3744294},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":637},"duration":{"text":"1 min","value":57},"end_location":{"lat":28.525057,"lng":77.3687393},"html_instructions":"Turn <b>right<\/b>  onto the slip road","polyline":{"points":"usamDcbgwMWn@Uf@Wd@OZKNMPMNC@[La@fAm@vA{@lBO\\IPs@lAa@l@gA|AeApAmA`BU^GRIr@"},"start_location":{"lat":28.5217113,"lng":77.37393949999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":172},"duration":{"text":"1 min","value":22},"end_location":{"lat":28.5259341,"lng":77.367346},"html_instructions":"Keep <b>left<\/b> to continue towards <b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-left","polyline":{"points":"shbmDsafwM@HCXIZO\\_@h@m@|@_@j@OPEFMH"},"start_location":{"lat":28.525057,"lng":77.3687393},"travel_mode":"DRIVING"},{"distance":{"text":"31 m","value":31},"duration":{"text":"1 min","value":5},"end_location":{"lat":28.526117,"lng":77.36758139999999},"html_instructions":"Turn <b>right<\/b> towards <b>Noida-Greater Noida Expy<\/b>","maneuver":"turn-right","polyline":{"points":"anbmD}xewMe@m@"},"start_location":{"lat":28.5259341,"lng":77.367346},"travel_mode":"DRIVING"},{"distance":{"text":"5.8 km","value":5750},"duration":{"text":"5 mins","value":326},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Turn <b>left<\/b> to merge onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"gobmDkzewMCAE?G@KBGDEBOPEDEB_@l@s@tAw@~A}@xB_BtD}@rBcA|BkBtD_BzC[l@[n@mAvBw@vAq@`AcFpHkAjBw@rAmBfDkApB}AjCcCpEOVMVgAlBy@rAcAbBgBtCsA`CkBnDy@|A{@vAeApBgAtBkA|BiAtBwB|DgC|Es@rAaAfByApCkBjDmA`CiC~EkCdFqAxBq@jAqAnBgBhCiBdCSVyCnDyCfDsDbEyEdFk@n@kCxCoEvEe@j@o@t@sAbBgClD{DzFu@`Am@x@_@d@k@p@WVYZwCnDy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.526117,"lng":77.36758139999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":92},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSL_CvAoCdB[R]VwAz@_@RMJGDA?CBIFIDe@\\MFkJnGkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit towards <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit towards <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b>  onto the slip road to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue towards <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1820},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5727074,"lng":77.2093641},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZt@lAVd@Xd@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Lj@H~@BdAFlE@~A@t@@`@FfAHvGDr@BVFRBFDFDDFBLB"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":293},"duration":{"text":"1 min","value":28},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"mrkmDo}fvM^@t@HXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5727074,"lng":77.2093641},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the slip road onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Go past the petrol station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":317},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5780024,"lng":77.17615409999999},"html_instructions":"Take the exit towards <b>Rao Tularam Marg<\/b>","maneuver":"ramp-left","polyline":{"points":"_dlmDyw`vMKPEDQL}@h@aAf@sAn@kAj@sBbAGD_@ROH"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1494},"duration":{"text":"4 mins","value":221},"end_location":{"lat":28.5724344,"lng":77.16255120000001},"html_instructions":"Turn <b>left<\/b> onto <b>Rao Tularam Marg<\/b><div style=\"font-size:0.9em\">Pass by Kendriya Vidyalaya (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"oslmD}m`vMS^KTITCXKVJXp@tBpArDhAzCrBvFFRv@~BtCrIrAtDDNhBlFVr@DLzDvKZ|@h@~AjBlFDJXz@"},"start_location":{"lat":28.5780024,"lng":77.17615409999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1754},"duration":{"text":"5 mins","value":295},"end_location":{"lat":28.5749652,"lng":77.1472837},"html_instructions":"Turn <b>right<\/b> to stay on <b>Rao Tularam Marg<\/b>","maneuver":"turn-right","polyline":{"points":"upkmD}x}uM`@jAHTFL@BBDHTIDKH{A|@g@ZWNq@`@QLWNeDrBc@X[TYRMJST_@^[`@QPKRKRa@`ACPEVKr@Gp@ARAX?X?`@@l@?N@J@RBRDTBJ?B?B?@?@AJn@~AHVRl@j@fB`AbDb@jA|ArH@P@T?Z?D?f@Gb@ADAFGr@OhAMn@M`AW~BY`DMjAe@dFSjA"},"start_location":{"lat":28.5724344,"lng":77.16255120000001},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1246},"duration":{"text":"1 min","value":84},"end_location":{"lat":28.571361,"lng":77.13584019999999},"html_instructions":"Take the slip road on the <b>right<\/b> onto <b>NH 48<\/b>","polyline":{"points":"q`lmDoyzuMIVEVOlAe@hEMvACf@Cj@?`@@`@B^B`@Jn@H^Tz@Xx@v@rBFN\\|@@J@HBd@Nj@@DJ^h@pBVz@X~@^jA|@`Cb@bAXl@Xl@NXzCzFp@lA\\j@jArB"},"start_location":{"lat":28.5749652,"lng":77.1472837},"travel_mode":"DRIVING"},{"distance":{"text":"3.8 km","value":3818},"duration":{"text":"4 mins","value":236},"end_location":{"lat":28.5430752,"lng":77.1185909},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"_jkmD_rxuMDNHNPZHHBBXZXZLJx@n@NHTLr@\\@?f@NXHh@J^Fb@Db@BdAFpHLH?H?|DLjBD`]z@tBHb@Br@HpAPx@NjATxCn@bEv@^H~A^bFlAnBh@tCt@xBp@RFZLv@`@t@b@RPXVRPb@d@`C~CfCnDrAhB|AvBvBvCbCfDdB~BtAjBtAhB\\b@Zd@t@dAf@r@Zf@`@p@Xh@^z@Zv@N^x@xBvB~FZp@R`@R`@T\\JPNPX\\XXVTZT\\Tb@V"},"start_location":{"lat":28.571361,"lng":77.13584019999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.6 km","value":4579},"duration":{"text":"5 mins","value":290},"end_location":{"lat":28.5105249,"lng":77.09385859999999},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-left","polyline":{"points":"gyemDefuuM^PPFh@T`A\\jMvEzH~Cv@d@^VZXNNNPNPRVPXT\\NZR^d@dAnP~`@bB`EzBrFd@hALXR`@`@v@X^Z^VX\\ZZVZTRNn@^bQlKvMdIhWlO`@T^TVL@@RLfAn@fAn@bC|Ad@V~ChBhE~BRLdAl@lAt@hAn@jDrBbD`Bv@d@zAz@ZRTLTJVHzA^j@Fd@B^BlADx@Av@ErAUj@Mx@UfAc@|@g@"},"start_location":{"lat":28.5430752,"lng":77.1185909},"travel_mode":"DRIVING"},{"distance":{"text":"9.1 km","value":9117},"duration":{"text":"9 mins","value":548},"end_location":{"lat":28.4476017,"lng":77.0379939},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"wm_mDskpuM`CaA`Ac@hAe@pD_Ab@GfB]VCb@Gj@Eb@?l@?^@l@Bj@Fr@LZHTFXJ`@L^PRJTJVPXNVP`@ZpDrCvDtCvAbA`Av@hBtAdA|@dDtCr@n@lDbDlDbDlFxEnAnAZVZXnDhDpDjDd@^b@\\lCnC@@~CvChHdHhAhAfNjMbFtEfE`EFDjF~ExArApAnAjAdApDjDzLnLdE`En@l@l@l@b@d@~ArBvBrC\\d@@@b@l@fB`CTX`C~CfFdHhJdMtAnBbB~Bh@n@bC`DPR`@l@JJtLlPh@p@j@r@TVVTLLNLNL\\V`@V^T`Aj@~@f@dAl@dAn@dAv@`Az@B@rCfCvBtB|LpLn@f@dJxIHHTTZ\\`QdP`A|@rIdIXVTPbNjMTVHJFF@@TVbSxQdD`D"},"start_location":{"lat":28.5105249,"lng":77.09385859999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":454},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.4454031,"lng":77.03435220000001},"html_instructions":"Take the exit towards <b>NH248A<\/b>","maneuver":"ramp-left","polyline":{"points":"odslDmneuM^JJBJBNDvCvCR^`@l@^t@h@jAHPTx@Pz@@FBJ@LBRHd@@L@L@L@N@L@L@L@L"},"start_location":{"lat":28.4476017,"lng":77.0379939},"travel_mode":"DRIVING"},{"distance":{"text":"3.7 km","value":3668},"duration":{"text":"8 mins","value":468},"end_location":{"lat":28.413301,"lng":77.0415783},"html_instructions":"Turn <b>left<\/b> at <b>Rajiv Chowk<\/b> onto <b>NH248A<\/b><div style=\"font-size:0.9em\">Pass by Shiv Mandir (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"wvrlDuwduMDFDFFDFDFFFBFDFBLFLBNBLBL?N?lACfH_@bCMT@f@HpBKPAb@CtJm@TCb@ETADAn@EzC]XEJADA`C]JAxBa@REZIzAa@bB_@NG?AjASdAOzBWJAh@EhCS`CS`AQ~@OPCFAt@Qp@O\\I^KbCi@|@OvA]b@Gb@Ix@MfEw@fDq@DAdAUpE{@j@MpB_@bB[|Cm@f@I~FoAPE`Cc@hCg@dAS~Cm@rAWzAY^G`ASFANGTGNEdB]dASvBc@r@MnFeAd@Kl@KtAWHC"},"start_location":{"lat":28.4454031,"lng":77.03435220000001},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":147},"duration":{"text":"1 min","value":78},"end_location":{"lat":28.413166,"lng":77.0430597},"html_instructions":"Turn <b>left<\/b><div style=\"font-size:0.9em\">Partial restricted-usage road<\/div>","maneuver":"turn-left","polyline":{"points":"cnllD{dfuMAS?CAu@@OFa@BWLiA@_@?e@"},"start_location":{"lat":28.413301,"lng":77.0415783},"travel_mode":"DRIVING"},{"distance":{"text":"58 m","value":58},"duration":{"text":"1 min","value":21},"end_location":{"lat":28.412646,"lng":77.0430847},"html_instructions":"Turn <b>right<\/b><div style=\"font-size:0.9em\">Restricted-usage road<\/div><div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-right","polyline":{"points":"imllDcnfuM^@fAE"},"start_location":{"lat":28.413166,"lng":77.0430597},"travel_mode":"DRIVING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBean> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class DistanceBean {
                /**
                 * text : 53.9 km
                 * value : 53878
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 1 hour 14 mins
                 * value : 4450
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 28.412646
                 * lng : 77.0430847
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 28.5355044
                 * lng : 77.39104809999999
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean {
                /**
                 * distance : {"text":"1.7 km","value":1747}
                 * duration : {"text":"4 mins","value":213}
                 * end_location : {"lat":28.523625,"lng":77.37975449999999}
                 * html_instructions : Head <b>south-west</b> on <b>Vishwakarma Rd</b>
                 * polyline : {"points":"{idmDamjwMn@zBfBjGFNDJHHFF`BxADD|FpEVTdBpAl@f@fBpAjLbJpBxA`Ax@NN|BbBlFbExDvCbDdCzEzD"}
                 * start_location : {"lat":28.5355044,"lng":77.39104809999999}
                 * travel_mode : DRIVING
                 * maneuver : turn-right
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private String travel_mode;
                private String maneuver;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public String getManeuver() {
                    return maneuver;
                }

                public void setManeuver(String maneuver) {
                    this.maneuver = maneuver;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 1.7 km
                     * value : 1747
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 4 mins
                     * value : 213
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 28.523625
                     * lng : 77.37975449999999
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : {idmDamjwMn@zBfBjGFNDJHHFF`BxADD|FpEVTdBpAl@f@fBpAjLbJpBxA`Ax@NN|BbBlFbExDvCbDdCzEzD
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 28.5355044
                     * lng : 77.39104809999999
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }
    }
}
