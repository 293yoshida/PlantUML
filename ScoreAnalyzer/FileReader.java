@startuml{plantuml_class_define.png}


class CSVFileReader{
	-String fileData
	-List<ResultMapper> ResultMapperList
	+FileReader(String filePass)
	-void readFile(String filePass)
	-void setResultMapper()
	+List<ResultMapper> getFileMapperObject()
}
note right
CSVファイル読み込みクラス
読み込んだデータは、マッパークラスにセットする
それぞれのチャプターごとにデータをセットし、リスト型で返す
end note

class ResultMapper{
	-int chapter
	-int[] resultArray
	+int getChapterNum()
	+int[] getResultArray()
	+void setChapterNum()
	+void setResultArray()
}
note right
ファイル読み込み結果、マッピング用オブジェクト
end note

CSVFileReader "0...*" o-- "1" ResultMapper : 集約
@enduml