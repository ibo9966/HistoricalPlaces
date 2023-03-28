package com.example.historicalplaces

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.historicalplaces.adapter.RecyclerViewAdapter
import com.example.historicalplaces.base.IBaseModel
import com.example.historicalplaces.databinding.ActivityMainBinding
import com.example.historicalplaces.dto.BodyDTO
import com.example.historicalplaces.dto.LastDTO
import com.example.historicalplaces.dto.TitleDTO

class MainActivity : AppCompatActivity() {


    private lateinit var adapter:RecyclerViewAdapter
    private val compenenList= mutableListOf<IBaseModel>()
    

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        LocationList()

        val layoutManager =LinearLayoutManager(this)
        binding.rv.layoutManager=layoutManager
        adapter= RecyclerViewAdapter(compenenList)
        binding.rv.adapter = adapter
    }

    private fun LocationList(){
        with(compenenList){

            add(TitleDTO("Türkiyedeki Tarihi Yerler"))
            add(BodyDTO(R.drawable.acikhava,"Göreme Açık Hava Müzesi, Türkiye'nin Kapadokya bölgesinde yer alan tarihi bir müzedir.Müze, 1984 yılında UNESCO tarafından Dünya Mirası Listesi'ne alınmıştır ve bölgedeki en popüler turistik yerlerden biridir. Müze içinde yer alan kiliseler, evler ve manastırlar, 10. ve 12. yüzyıllar arasında yapılmış olup, Kapadokya'nın erken Hristiyan dönemine ait önemli eserlerdir."))
            add(LastDTO("Page : 1"))
            add(BodyDTO(R.drawable.ayasofya,"Ayasofya , İstanbul'un tarihi yarımadasında yer alan bir müzedir.Müze, Ayasofya Camii'nin avlusunda bulunmaktadır ve Bizans İmparatorluğu döneminden kalma önemli eserler barındırmaktadır.Müze içinde yer alan eserler arasında Bizans döneminden kalma sütunlar, heykeller ve mozaikler gibi birçok tarihi yapıt bulunmaktadır."))
            add(LastDTO("Page : 2"))
            add(BodyDTO(R.drawable.balikligol,"Balıklı Göl, Şanlıurfa şehrinde yer alan tarihi bir müzedir.Müze, Hz. İbrahim'in ateşe atılmaktan kurtulduğu, Hz. İbrahim'in Doğduğu Mağara'nın etrafındaki alanda bulunmaktadır.Müze içinde yer alan eserler arasında tarihi yapılar, mezarlar ve mağaralar gibi birçok önemli yapıt bulunmaktadır."))
            add(LastDTO("Page : 3"))
            add(BodyDTO(R.drawable.bodrum,"Bodrum Kalesi, Bodrum'un en önemli tarihi yapılarından biridir ve 1402 yılında İstanbul'un fethinden sonra, St. Jean Şövalyeleri tarafından inşa edilmiştir.Kale, 32 metre yüksekliği ve 15 metre genişliği ile oldukça büyüktür ve Bodrum Kalesi Müzesi olarak kullanılmaktadır. Müze, Türkiye'nin en önemli denizcilik müzelerinden biridir ve Antik Çağ'dan kalma seramik, heykel ve diğer eserlerle doludur.Bodrum Kalesi, yıllar boyunca birçok kez yenilenmiştir ve günümüzde de turistlerin ilgi odağıdır. Ziyaretçiler, kaledeki antik eserlerin yanı sıra, muhteşem Bodrum Körfezi manzarasını da görebilirler."))
            add(LastDTO("Page : 4"))
            add(BodyDTO(R.drawable.efes,"Efes Antik Kenti, Türkiye'nin batısında bulunan ve Antik Dünya'nın en önemli liman kentlerinden biri olarak kabul edilen tarihi bir yerleşim yeridir."))
            add(LastDTO("Page : 5"))
            add(BodyDTO(R.drawable.galata,"Galata Kulesi, 1348 yılında Cenevizliler tarafından inşa edilmiştir ve İstanbul'un tarihi yarımadası, Haliç ve Boğaziçi'nin muhteşem manzaralarını sunan bir gözlem noktasıdır. Kule, Osmanlı döneminde değişik zamanlarda bir gözlem noktası, yangın kulesi ve hapishane olarak kullanılmıştır. Günümüzde, ziyaretçiler tarafından popüler bir turistik yer olarak ziyaret edilmektedir."))
            add(LastDTO("Page : 6"))
            add(BodyDTO(R.drawable.kizkulesi,"Kız Kulesi, İstanbul Boğazı'ndaki küçük bir adada yer alan tarihi bir kuledir ve 2500 yılı aşkın bir süredir çeşitli amaçlar için kullanılmaktadır. İlk olarak M.Ö. 8. yüzyılda yapıldığı düşünülen kule, Bizans, Ceneviz ve Osmanlı dönemlerinde farklı amaçlarla kullanılmıştır. Günümüzde, Kız Kulesi, restoran, kafe, müze ve özel etkinlikler için bir mekan olarak hizmet vermektedir."))
            add(LastDTO("Page : 7"))

            add(TitleDTO("Türkiye Dışındaki Tarihi Yerler"))
            add(BodyDTO(R.drawable.azizpeter,"Aziz Peter Bazilikası, Roma'nın Vatikan kentinde bulunan en önemli Hristiyan kiliselerinden biridir ve Katolik dünyasının en büyük dini yapılarından biridir."))
            add(LastDTO("Page : 8"))
            add(BodyDTO(R.drawable.bayonapinagi,"Bayon Tapınağı, Kamboçya'daki Angkor Wat kompleksinin bir parçası olan, 12. yüzyılda Khmer İmparatorluğu tarafından inşa edilmiş bir tapınaktır ve devasa yüz heykelleri ile ünlüdür."))
            add(LastDTO("Page : 9"))
            add(BodyDTO(R.drawable.tacmahal,"Tac Mahal, Kamboçya'da değil, Hindistan'ın Agra şehrinde bulunan, 17. yüzyılda Mughal İmparatoru Şah Cihan tarafından eşi Mumtaz Mahal'in anısına yaptırılmış bir mimari yapıdır."))
            add(LastDTO("Page : 10"))
            add(BodyDTO(R.drawable.machu,"Machu Picchu Antik Şehri, Peru'nun güneydoğusunda, And Dağları'nda yer alan, İnka İmparatorluğu'nun en önemli arkeolojik yerlerinden biridir. "))
            add(LastDTO("Page : 11"))
        }
    }
}