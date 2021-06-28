#
#  Be sure to run `pod spec lint sapcpsdk.podspec' to ensure this is a
#  valid spec and to remove all comments including this before submitting the spec.
#
#  To learn more about Podspec attributes see http://docs.cocoapods.org/specification.html
#  To see working Podspecs in the CocoaPods repo see https://github.com/CocoaPods/Specs/
#

Pod::Spec.new do |s|

  # ―――  Spec Metadata  ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  #
  #  These will help people to find your library, and whilst it
  #  can feel like a chore to fill in it's definitely to your advantage. The
  #  summary should be tweet-length, and the description more in depth.
  #

  s.name         = "SAPFoundation"
  s.version      = "__VERSION__"
  s.summary      = "SAP Cloud Platform SDK for iOS common framework"

  s.description  = <<-DESC
                   DESC

  s.homepage     = "https://www.sap.com/germany/developer/topics/cloud-platform-sdk-for-ios.html"


  # ―――  Spec License  ――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.license      = "SAP-DEV"


  # ――― Author Metadata  ――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.author             = "SAP SE"


  # ――― Platform Specifics ――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.platform     = :ios, "10.0"


  # ――― Framework ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.vendored_frameworks = "SAPFoundation.framework"

  # ――― Dependencies ――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  s.dependency "SAPCommon", "~> __VERSION__"

end
