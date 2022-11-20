package com.nkechinnaji.datasorting

object UiUtils {

    /***
     * Set image descriptions
     */
    fun setTextDescriptions(): ArrayList<String> {
        var descriptions: ArrayList<String> = arrayListOf()
        descriptions.add(0, "Tennis is so much fun")
        descriptions.add(1, "How about a swim!")
        descriptions.add(2, "Running wild!")
        descriptions.add(3, "I love you")
        descriptions.add(4, "O Marry me!!")
        descriptions.add(5, "Take a chill pill")
        descriptions.add(6, "Best friends for life")
        descriptions.add(7, "Cooking takes too long")
        descriptions.add(8, "Take him for walks")
        descriptions.add(9, "Mind your business")
        return descriptions
    }

     fun setImages(): ArrayList<Int> {
        var imageList: ArrayList<Int> = arrayListOf()
        imageList.add(0, R.drawable.ic_tennis)
        imageList.add(1, R.drawable.ic_beachday)
        imageList.add(2, R.drawable.ic_runwild)
        imageList.add(3, R.drawable.ic_lovehearts)
        imageList.add(4, R.drawable.ic_marryme)
        imageList.add(5, R.drawable.ic_relax)
        imageList.add(6, R.drawable.ic_buddies)
        imageList.add(7, R.drawable.ic_cooking)
        imageList.add(8, R.drawable.ic_dogwalk)
        imageList.add(9, R.drawable.ic_peepingtom)
        return imageList
    }

}