@startuml{plantuml_class_define.png}

class ScoreAnalyser{
	-{static} final main(args[])
}

ScoreAnalyser "1" *-- "1" CSVFileReader : 利用
note left
ファイル読み込み
end note
CSVFileReader "0...*" o-- "1" ResultMapper : 集約

ScoreAnalyser "1" *-- "1" DataAnalyser : 利用
note bottom
データ分析
入力:List<ResultMapper>
end note

ScoreAnalyser "1" *-- "1" ResultViewer : 利用
note bottom
データ表示
入力:List<AnalyseData>
end note


@enduml