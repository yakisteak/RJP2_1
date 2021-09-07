<%@page contentType="text/html;charset=utf-8" %>
<html>
<head>
</head>
<body>
<form action="./YakisizimiServlet" method="POST">
<h1>国民保険料等、手取り計算マシン</h1><br />
名前(ニックネーム)：<input name="name" ></input><br />
年齢<input type="number" name="old"><br />
<input type="radio" name="sal_type" value="month" checked> 月給 &nbsp;
<input type="radio" name="sal_type" value="year"> 年給<br />
（差し引き前）：<input type ="number" name="sal"/>円<br />
（その他所得<input type ="number" name="othersal"/>円）<br />
<input type="checkbox" name="bonus1a">ボーナス：<input type="number" name="bonus1"><br />
<input type="checkbox" name="bonus2a">ボーナス：<input type="number" name="bonus2"><br />
<br /><br /><br />
保険種別
<input type="radio" name="hoken_type" value="kokumin" checked> 国民健康保険 &nbsp;
<input type="radio" name="hoken_type" value="other"> その他保険 &nbsp;
<input type ="number" name="hoken_kin"/>円<br />
年金種別
<input type="radio" name="nenkin_type" value="kokumin" checked> 国民年金 &nbsp;
<input type="radio" name="nenkin_type" value="kousei"> 厚生年金<br />
雇用種別
<input type="radio" name="job_type" value="ippan" checked> 国民年金 &nbsp;
<input type="radio" name="job_type" value="nrsss" > 農林水産業、清酒製造の事業＊ &nbsp;
<input type="radio" name="job_type" value="const"> 建設業<br />
＊園芸サービス、牛馬の育成、酪農、養鶏、養豚、内水面養殖および特定の船員を雇用する
<br />事業については一般の事業の率が適用されます。
<br /><br /><br />
控除参考データ<br />
R2中の世帯収入<input type="number" name="lyear_income"><br />
<!--   医療費控除：<input type="number" name="bonus2"><br /> -->
＊所得調整控除などに該当する場合、一部の保険料計算に誤差が生じる場合があり、この計算結果は、R３年度の東京都、中野区の税額、保険料額をもとに作成しています。
＊国民健康保険料は単身世帯を前提として計算しています、納付義務者は世帯主であり、本来は住民票の世帯ごとに計算します<br />


</form>
</body>
</html>