package com.example.inbox.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class HomeViewModel : ViewModel() {

    private val _emails = MutableLiveData<List<Email>>().apply {
        value = generateRandomEmails()
    }

    val emails: LiveData<List<Email>> = _emails

    private fun generateRandomEmails(): List<Email> {
        val senders = listOf(
            "Công ty TNHH XYZ",
            "Nguyễn Văn A",
            "Trần Thị B",
            "Học viện Công nghệ",
            "Trung tâm Đào tạo",
            "Công ty Tài chính ABC",
            "Bệnh viện Y học cổ truyền",
            "Công ty Dịch vụ Mới",
            "Trung tâm Giáo dục Quốc tế",
            "Công ty TNHH Dịch vụ Khách hàng",
            "Viện Nghiên cứu Công nghệ",
            "Tổ chức Từ thiện",
            "Công ty TNHH Vận tải Đường bộ"
        )

        val subjects = listOf(
            "Thư mời tham gia khóa học mới",
            "Thông báo cập nhật lịch trình",
            "Kết quả khảo sát mới",
            "Thông báo bảo trì hệ thống",
            "Mời tham gia hội thảo trực tuyến",
            "Thông tin ưu đãi đặc biệt",
            "Đề nghị hợp tác",
            "Thông báo phát hành sản phẩm mới",
            "Hướng dẫn sử dụng dịch vụ",
            "Cảm ơn bạn đã tham gia sự kiện",
            "Thông báo về cuộc thi",
            "Cảnh báo an ninh mạng",
            "Chúc mừng bạn đã trúng thưởng"
        )

        val times = listOf("08:00 AM", "09:30 AM", "10:15 AM", "12:00 PM", "01:45 PM", "03:00 PM", "04:30 PM", "06:00 PM")

        return List(10) {
            Email(
                senderName = senders[Random.nextInt(senders.size)],
                sentTime = times[Random.nextInt(times.size)],
                content = subjects[Random.nextInt(subjects.size)],
                isStarred = Random.nextBoolean()
            )
        }
    }
}

