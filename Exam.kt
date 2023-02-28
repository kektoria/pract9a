class Exam (
    var name: String
    var exam: String
    var dateExam: Int
    var grade: Int)
{
    fun main()
    {
        val stud1 = Exam("Полина")
        val stud2 = Exam("Иван","Математика")
        val stud3 = Exam("Анастасия","Русский язык",15,3)

        println("Имя: ${stud1.name} Экзамен: ${stud1.exam} Дата экзамена: ${stud1.dateExam} Оценка: ${stud1.grade}")
        println("Имя: ${stud2.name} Экзамен: ${stud2.exam} Дата экзамена: ${stud2.dateExam} Оценка: ${stud2.grade}")
        println("Имя: ${stud3.name} Экзамен: ${stud3.exam} Дата экзамена: ${stud3.dateExam} Оценка: ${stud3.grade}")
    }
    fun vvod()
    {
        print("введите имя студента: ")
        var name = readLine()
        print("введите предмет экзамена: ")
        var exam = readLine()
        print("введите дату проведения экзамена: ")
        var dateExam = readLine()
        print("введите полученную студентом оценку за экзамен: ")
        var grade = readLine()
    }

    fun info()
    {
        println("имя студента: " + name)
        println("предмет: " + exam)
        println("дата проведения экзамена: " + dateExam)
        println("оценка: "+ grade)
    }
    constructor(name: String, exam: String, dateExam: Int, grade: Int)
    {

    }
}