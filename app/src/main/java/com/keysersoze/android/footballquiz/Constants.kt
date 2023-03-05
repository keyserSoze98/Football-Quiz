package com.keysersoze.android.footballquiz

import com.keysersoze.android.quizapp.R

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What club does this logo belong to?",
            R.drawable.betis,
            "Real Mallorca",
            "Benfica",
            "Real Betis",
            "Valencia",
            3
        )

        val que2 = Question(
            2,
            "What club does this logo belong to?",
            R.drawable.fulham,
            "Rangers",
            "Fulham",
            "Swansea",
            "QPR",
            2
        )

        val que3 = Question(
            3,
            "What club does this logo belong to?",
            R.drawable.celtic,
            "Hibernian",
            "Rangers",
            "Celtic",
            "St. Mirren",
            3
        )

        val que4 = Question(
            4,
            "What club does this logo belong to?",
            R.drawable.dundalk,
            "Waterford",
            "Drogheda United",
            "Cork City",
            "Dundalk FC",
            4
        )

        val que5 = Question(
            5,
            "What club does this logo belong to?",
            R.drawable.lagalaxy,
            "LA Galaxy",
            "New York Red Bulls",
            "D.C. United",
            "Los Angeles FC",
            1
        )

        val que6 = Question(
            6,
            "What club does this logo belong to?",
            R.drawable.malmo,
            "Trelleborgs FFt",
            "Malmo FF",
            "IFK Goteborg",
            "Oerebro SK",
            2
        )

        val que7 = Question(
            7,
            "What club does this logo belong to?",
            R.drawable.dundee,
            "Rangers",
            "Kilmarnock",
            "Heart of Midlothian",
            "Dundee United",
            4
        )

        val que8 = Question(
            8,
            "What club does this logo belong to?",
            R.drawable.norwich,
            "Norwich City",
            "Nottingham Forest",
            "Birmingham City",
            "Wolves",
            1
        )

        val que9 = Question(
            9,
            "What club does this logo belong to?",
            R.drawable.sunderland,
            "Newcastle United",
            "Middlesborough",
            "Sunderland",
            "Gateshead",
            3
        )

        val que10 = Question(
            10,
            "What club does this logo belong to?",
            R.drawable.notm,
            "Norwich City",
            "Nottingham Forest",
            "Birmingham City",
            "Wolves",
            2
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        return questionsList
    }
}