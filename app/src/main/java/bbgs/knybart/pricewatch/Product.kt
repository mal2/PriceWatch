package bbgs.knybart.pricewatch

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product(
    @PrimaryKey val pId: Int?,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "Description") val description: String?,
    @ColumnInfo(name = "price") val price: String?,
    @ColumnInfo(name = "url") val url: String?
)
