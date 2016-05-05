@startuml{plantuml_class_define.png}

(*) --> "Main"

--> "mainインスタンス初期化"

--> "File読み込み"
note right
CSV ファイルの読み込み
【データ構造】
chapter:章番号
problem:結果(正解:1,誤り:0) 問題間は「,」
例)
chapter:0
problem:1,1,0,0,0,1
end note

--> "データ分析"
note right
間違い問題の確率分布
・各問題ごとの過去の平均正答率（正解を１，間違いは０として計算）
end note

--> "分析結果の描画"
note right
・グラフによる描画
・時系列ごとの各チャプターごとの結果
・チャプターごとの累積確率分布
・チャプターごとの累積確率分布の推移
・チャプターの問題ごとの累積確率分布の推移
end note
--> (*)
@enduml