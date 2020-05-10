	隨機森林樹說明(Random Forest)
	集成(Ensemble)是將多個模型的結果組合在一起，透過投票或是加權的
	方式得到最終結果。

	決策樹生成時，是考慮所有資料與特徵來做切分的，
	而隨機森林的每一顆樹在生成過程中，都是隨機使用一部份的訓練資料與特徵
	代表每棵樹都是隨機的資料訓練而成的。

	模型參數
	n_estimators= 決策樹的數量
	Criterion: 衡量資料相似程度
	max_features= 如何選取 features
	max_depth: 樹能生長的最深限制
	Min_samples_split: 至少要多少樣本以上才進行切分
	Min_samples_lear: 最終的葉子 (節點) 上至少要有多少樣本

	訊息增益 (Information Gain)
	決策樹模型會用 features 切分資料，該選用哪個 feature 來切分則是由訊息
	增益的大小決定的。希望切分後的資料相似程度很高，通常使用吉尼係數(gini)來
	衡量相似程度。

	函數計算準確率 (accuracy_score)
	不管是正確預測的fraction（default），還是count(normalize=False)。
	在multilabel分類中，該函數會返回子集的準確率。如果對於一個樣本來說，必須嚴格匹配真實資料集中的label，
	整個集合的預測標籤返回1.0；否則返回0.0.
	預測值與真實值的準確率，在n個樣本下的計算公式如下：
	accuracy(y,ŷ )=1nsamples∑i=0nsamples−1l(ŷ i=yi)accuracy(y,y^)=1nsamples∑i=0nsamples−1l(y^i=yi)
	
	特徵名稱 (feature_names)
	以鳶尾花(iris)來說明:
	1. 花萼長度(Sepal Length)：計算單位是公分
	2. 花萼寬度(Sepal Width)：計算單位是公分
	3. 花瓣長度(Petal Length) ：計算單位是公分
	4. 花瓣寬度(Petal Width)：計算單位是公分

	隨機森林樹的特徵重要性 (Feature importance)
	我們可以從構建樹的過程中，透過 feature 被用來切分的次數，來得知哪些features是相對有用的
	所有 feature importance 的總和為 1
	
	練習的範例中我測試了3種資料集(iris,boston, wine)並更改了決策樹的數量，與每棵樹的最大深度，
	以鳶尾花(iris)為例
	使用20 顆樹，每棵樹的最大深度為 4
	clf = RandomForestClassifier(
	      n_estimators=20, 
	      max_depth=4,
	      criterion = 'gini',
	      max_features = 'auto',
	      min_samples_split = 2,
	      min_samples_leaf = 1
	      )
	print:
	Acuuracy:  0.9473684210526315
	['sepal length (cm)', 'sepal width (cm)', 'petal length (cm)', 'petal width (cm)']
	Feature importance:  [0.08205501 0.01035056 0.42839105 0.47920338]

	使用200 顆樹，每棵樹的最大深度為 40
	clf = RandomForestClassifier(
	      n_estimators=200, 
	      max_depth=40,
	      criterion = 'gini',
	      max_features = 'auto',
	      min_samples_split = 2,
	      min_samples_leaf = 1
	)  
	print
	Acuuracy:  0.9777777777777777
	['sepal length (cm)', 'sepal width (cm)', 'petal length (cm)', 'petal width (cm)']
	Feature importance:  [0.08533722 0.03421342 0.44261819 0.43783116]

	print出來的數值，知道了樹的數量跟深度會影響結果
	準確率(accuracy)會隨著樹的增加而提高
	特徵重要性 (Feature importance)也會有改變


參考資料
[scikit](https://scikit-learn.org/dev/modules/ensemble.html)
[random-forest](https://medium.com/@Synced/how-random-forest-algorithm-works-in-machine-learning-3c0fe15b6674)
[隨機森林(Random Forest)介紹](https://medium.com/jameslearningnote/%E8%B3%87%E6%96%99%E5%88%86%E6%9E%90-%E6%A9%9F%E5%99%A8%E5%AD%B8%E7%BF%92-%E7%AC%AC3-5%E8%AC%9B-%E6%B1%BA%E7%AD%96%E6%A8%B9-decision-tree-%E4%BB%A5%E5%8F%8A%E9%9A%A8%E6%A9%9F%E6%A3%AE%E6%9E%97-random-forest-%E4%BB%8B%E7%B4%B9-7079b0ddfbda)




